package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            String value = "";

            if (i % 3 == 0) {
                value = value.concat("Fizz");
            }

            if (i % 5 == 0) {
                value = value.concat("Buzz");
            }

            if (value.isEmpty()) {
                value = value.concat(String.valueOf(i));
            }

            result.add(value);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.print("FizzBuzz");
        System.out.print("\nStarting with case n = 3\n");
        System.out.println(fizzBuzz(3));
        System.out.print("\nStarting with case n = 5\n");
        System.out.println(fizzBuzz(5));
        System.out.print("\nStarting with case n = 15\n");
        System.out.println(fizzBuzz(15));
    }
}
