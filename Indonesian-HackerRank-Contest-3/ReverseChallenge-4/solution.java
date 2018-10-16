import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] numbers = new int[length];
        
        for(int i = 0;i < length;i++) {
           numbers[i] = scan.nextInt();
           pararusing(numbers[i]);
          
        }
        
    }
    
    public static void pararusing(int number) {
        int terbagi = 0;
        int total = 0;
        int number2 = number;
        while (number2 > 1) {
            terbagi = number2 / 2;
            number2 = terbagi;            
            total = total + terbagi;
            System.out.print(terbagi + " ");
        }
        System.out.println(total + number);
    }
} 
