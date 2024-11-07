import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder(A);
        B.reverse();
        
        // Compare the reversed string with the original string
        if(B.toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



