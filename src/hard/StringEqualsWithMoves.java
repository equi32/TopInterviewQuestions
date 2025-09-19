package hard;

import java.util.Arrays;

public class StringEqualsWithMoves {

    public static int solution(String S, String T) {
        if (S.equals(T)) return 0;

        int n = S.length();

        // Convert to arrays for easier processing
        int[] s = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = S.charAt(i) - '0';
            t[i] = T.charAt(i) - '0';
        }

        // Key insight: We need to think about this as a system of equations
        // Each operation at position i adds 1 to both position i and i+1
        // So if we perform x[i] operations at position i, then:
        // s[0] + x[0] ≡ t[0] (mod 10)
        // s[1] + x[0] + x[1] ≡ t[1] (mod 10)
        // s[2] + x[1] + x[2] ≡ t[2] (mod 10)
        // ...
        // s[n-1] + x[n-2] ≡ t[n-1] (mod 10)

        // Working backwards to solve for x[i]:
        int[] operations = new int[n - 1];
        int[] current = s.clone();

        // From the last equation: s[n-1] + x[n-2] ≡ t[n-1] (mod 10)
        // So: x[n-2] ≡ (t[n-1] - s[n-1]) (mod 10)
        operations[n - 2] = (t[n - 1] - current[n - 1] + 10) % 10;

        // Apply this operation
        current[n - 2] = (current[n - 2] + operations[n - 2]) % 10;
        current[n - 1] = (current[n - 1] + operations[n - 2]) % 10;

        // Work backwards for the rest
        for (int i = n - 3; i >= 0; i--) {
            // s[i+1] + x[i] + x[i+1] ≡ t[i+1] (mod 10)
            // We know x[i+1], so: x[i] ≡ (t[i+1] - s[i+1] - x[i+1]) (mod 10)
            operations[i] = (t[i + 1] - current[i + 1] + 10) % 10;

            // Apply this operation
            current[i] = (current[i] + operations[i]) % 10;
            current[i + 1] = (current[i + 1] + operations[i]) % 10;
        }

        // Check if the first position matches
        if (current[0] != t[0]) {
            return -1;
        }

        // Sum up all operations
        int totalMoves = 0;
        for (int op : operations) {
            totalMoves += op;
        }

        return totalMoves;
    }


    static void main(String[] args) {
        System.out.println(solution("13471", "59604"));
    }
}
