package basic;

import java.util.Arrays;

public class RunningSumOfOneDimensionArray {
    public static int[] runningSum(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] += numbers[i - 1];
        }

        return numbers;
    }
    public static void main(String[] args) {
        System.out.println("Starting with RunningSumOfOneDimensionArray");
        int[] test = {1, 2, 3, 4};
        System.out.println("Executing for: " + Arrays.toString(test));
        System.out.println(Arrays.toString(runningSum(test)));
    }
}
