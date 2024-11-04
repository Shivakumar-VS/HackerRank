import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        try
        {
            int x= sc.nextInt();
        int y=sc.nextInt();
            if(x>0&&y>0)
            {
                System.out.println(x/y);
            }
             if(y==0)
             {
             System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException ");
           
        }
         
}
}