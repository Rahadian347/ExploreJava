import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] numbers = new int[length];        
        for(int i = 0;i < length;i++) {
           numbers[i] = scan.nextInt();            
           int stop = 0;
           int palindrome = 0;
           int total = 0;            
           while (stop <= numbers[i]) {
             if (isPrime(palindrome)) {
                if(isPalindrome(palindrome)){
                  stop++; 
                  total = palindrome;
                  if (total == 1) {
                      total = total+ 1;
                  }
                   palindrome++;    
                } else {
                    palindrome++; 
                }
             } else if (!isPrime(palindrome)){
                palindrome++;
             }           
           } System.out.println(total);
        }
        
    }
    
    //check prime
    public static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse;

    }
} 
