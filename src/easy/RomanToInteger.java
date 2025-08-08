package easy;

import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String roman) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        Character prev = null;
        int lastIndex = roman.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            Character c = roman.charAt(i);
            int actualInt = romanMap.get(c);
            if (prev == null) {
                result += actualInt;
                prev = c;
                continue;
            }

            int prevInt = romanMap.get(prev);

            if (actualInt < prevInt) {
                result -= actualInt;
            } else {
                result += actualInt;
            }

            prev = c;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMXXV"));
    }
}
