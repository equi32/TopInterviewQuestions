package basic;

public class FindMaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveCount = 0;
        int maxConsecutiveCount = 0;

        for (int num : nums) {
            if (num == 1) {
                consecutiveCount++;
                if (consecutiveCount > maxConsecutiveCount) {
                    maxConsecutiveCount = consecutiveCount;
                }
                continue;
            }

            consecutiveCount = 0;
        }

        return maxConsecutiveCount;
    }

    public static void main(String[] args) {
        int[] test = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(test));
    }
}
