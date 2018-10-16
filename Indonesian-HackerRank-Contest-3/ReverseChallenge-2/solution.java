import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int t = in.nextInt();
        long[] array = new long[t];
        
        for(i = 0; i < t; i++) {
            array[i] = in.nextLong();
            BigInteger fact = factorial(array[i]);
            System.out.println(fact);
        }     
    }
    
} 
