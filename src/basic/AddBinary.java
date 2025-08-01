package basic;

import java.math.BigInteger;

public class AddBinary {

    public static String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num1.add(num2);

        return sum.toString(2);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
