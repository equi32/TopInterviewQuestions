package easy;

import java.util.Arrays;

public class ReArrangeArray {
    public static void rearrange(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            // if left is negative, it's already in the right place
            if (nums[left] < 0) {
                left++;
            }
            // if right is positive, it's already in the right place
            else if (nums[right] >= 0) {
                right--;
            }
            // if left is positive and right is negative → swap
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        System.out.printf(Arrays.toString(nums));
    }

    static void main(String[] args) {
        int[] nums = {9, -3, 5, -2, -8, -6, 1, 3};
        rearrange(nums);
    }
}
