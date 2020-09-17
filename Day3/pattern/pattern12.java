import java.util.*;
     
     public class Main{
     
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
     
          // write ur code here
          int rows=scn.nextInt();
          int a=0;
          int b=1;
          int c;
          int nos=1;
          for(int i=1;i<=rows;i++)
          {
              for(int j=1;j<=nos;j++)
              {
                  System.out.print(a+"\t");
                  c=a+b;
                  a=b;
                  b=c;
                  
              }
              nos++;
              System.out.println();
          }
     
      }
     }