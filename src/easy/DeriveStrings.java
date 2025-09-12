package easy;

public class DeriveStrings {

    static boolean areRotations(String s1, String s2) {
        int n = s1.length();

        // Generate and check all possible rotations of s1
        for (int i = 0; i < n; ++i) {

            // If current rotation is equal to s2, return true
            if (s1.equals(s2)) {
                return true;
            }

            // Right rotate s1
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        return false;
    }

    static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }
}
