package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

    static void main(String ...args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.printf("Contains duplicate: " + result);
    }
}
