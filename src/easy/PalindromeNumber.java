package easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder sb = new StringBuilder(value);
        try {
            int reversedValue = Integer.parseInt(sb.reverse().toString());
            return x == reversedValue;
        } catch (Exception ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        var result = isPalindrome(-121) ? "Is Palindrome" : "Is Not Palindrome";
        System.out.println(result);
    }
}
