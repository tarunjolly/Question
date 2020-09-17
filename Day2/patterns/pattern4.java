import java.util.*;
          
          public class Main{
          
          public static void main(String[] args) {
              Scanner scn = new Scanner(System.in);
          
               // write ur code here
               int rows=scn.nextInt();
               int spaces=0;
               int stars=rows;
               for(int i=1;i<=rows;i++)
               {
                   for(int j=1;j<=spaces;j++)
                   {
                       System.out.print("\t");
                   }
                   spaces++;
                   for(int k=1;k<=stars;k++)
                   {
                       System.out.print("*\t");
                   }
                   stars--;
                   System.out.println();
               }
               
          
           }
          }