import java.util.*;
       
       public class Main{
       
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
       
            // write ur code here
           int rows=scn.nextInt();
           int outerspaces=rows/2;

           int  nos=1;

           for(int i=1;i<=rows;i++)
           {  if(i!=(rows+1)/2)
              {for(int k=1;k<=outerspaces;k++)
              { 
                  System.out.print("\t");
              }

              for(int j=1;j<=nos;j++)
              {
                System.out.print("*\t");
              }

              }
              else
              {
                for(int j=1;j<=rows;j++)
                {
                System.out.print("*\t");
                }                
              }

              if(i<(rows+1)/2)
              {
                nos++;

              }
              else
              {
                nos--;
              }
              System.out.println();


           }
       
        }
       }