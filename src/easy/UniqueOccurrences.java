package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int j : arr) {
            int count = 1;

            if (occurrences.containsKey(j)) {
                count += occurrences.get(j);
            }

            occurrences.put(j, count);
        }

        Set<Integer> s = new HashSet<>(occurrences.values());

        return occurrences.size() == s.size();
    }

    static void main(String[] args) {
        int[] caseOne = {1,2,2,1,1,3};
        int[] caseTwo = {1,2};
        int[] caseThree = {-3,0,1,-3,1,1,1,-3,10,0};

        System.out.println("Has case 1 uniqueOccurrences: " + uniqueOccurrences(caseOne));
        System.out.println("Has case 2 uniqueOccurrences: " + uniqueOccurrences(caseTwo));
        System.out.println("Has case 3 uniqueOccurrences: " + uniqueOccurrences(caseThree));
    }
}
