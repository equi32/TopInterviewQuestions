package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int ans1 = 0, ans2 = 0;
        for (int i: nums1) {
            set1.add(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                ans2++;
            }
            set2.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (set2.contains(nums1[i])) {
                ans1++;
            }
        }
        return new int[]{ans1, ans2};
    }

    static void main(String ...args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};
        int[] result = findIntersectionValues(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
