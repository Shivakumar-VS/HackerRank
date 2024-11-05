import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }

    // Method to capitalize the first letter of a given word
    private static String capitalizeFirstLetter(String word) 
    {
        if (word == null || word.isEmpty()) 
        {
            return word; // Return the word as is if it's null or empty
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
    
}



