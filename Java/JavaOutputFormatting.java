import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        // Read the input lines and print them formatted
        for(int i=0; i<3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            
            // Format: % means we're using format specifiers
            // -15s means the string should be left-justified with a width of 15 characters
            // %03d means the integer should be three digits long, padded with leading zeros if necessary
            System.out.printf("%-15s%03d%n", s1, x);
        }
        
        System.out.println("================================");
    }
}


