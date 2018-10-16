import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();        
        char[] array = new char[t];        
        for (int k = 0; k < t; k++) {
            array[k] = in.next().charAt(0);
        }        
        for (int i = 0; i < t;i++) {
            char c = array[i];
            int ascii = (int)c;
            
            if ((ascii % 2) == 0) {
                ascii = ascii - 96;
                System.out.println(ascii);
            } else {
                System.out.println(ascii);
            }     
        }
    }
} 
