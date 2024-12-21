package personal;

import java.math.BigInteger;

public class factorialOfbigData {
    public static void main(String[] args) {
        int a = 100;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1;i<a;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }}
