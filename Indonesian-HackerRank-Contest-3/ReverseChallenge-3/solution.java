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
             if (isPalindrome(palindrome)) {
                stop++; 
                total = palindrome;
                palindrome++;
             } else if (!isPalindrome(palindrome)){
                palindrome++;
             }           
           } System.out.println(total);
        }   
    }
    
    //check palindrome
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
