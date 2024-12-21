package leetCode;

import java.math.BigInteger;

public class MultiplyString43 {
    public static void main(String[] args) {
        String s1 = "6913259244";
        String s2 = "71103343";
        BigInteger s3 = new BigInteger(s1);
        BigInteger s4 = new BigInteger(s2);
        BigInteger s5 = s3.multiply(s4);
        System.out.println(s5);
    }
}
