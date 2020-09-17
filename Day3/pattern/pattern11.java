import java.util.*;
     
     public class Main{
     
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int rows=scn.nextInt();
        
          // write ur code here
          int number=1;
          for(int i=1;i<=rows;i++)
          {
              for(int j=1;j<=i;j++)
              {
                  System.out.print(number+"\t");
                  number++;
              }
              System.out.println();
          }
     
      }
     }