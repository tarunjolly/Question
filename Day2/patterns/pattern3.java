import java.util.*;
            
            public class Main{
            
            public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
            
                 // write ur code here
                 int rows=scn.nextInt();
                 int spaces=rows-1;
                 int nos=1;
                 for(int i=1;i<=rows;i++)
                 {
                     for(int k=1;k<=spaces;k++)
                     {
                         System.out.print("\t");
                     }
                     spaces--;
                     for(int j=1;j<=nos;j++)
                     {
                         System.out.print("*\t");
                     }
                     nos++;
                     System.out.println();
                 }
            
             }
            }