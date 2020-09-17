import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
           // write ur code here
          int rows=scn.nextInt();
          int innerspaces=rows+rows-3;
          for(int i=1;i<=rows;i++)
          {
            for(int j=1;j<=i;j++)
            {
              System.out.print(j+"\t");
            }
            for(int k=1;k<=innerspaces;k++)
            {
              System.out.print("\t");
            }
            innerspaces-=2;
            if(i==rows)
            {
              for(int j=i-1;j>=1;j--)
              {
              System.out.print(j+"\t");
              }  
            }
            else
            {
              for(int j=i;j>=1;j--)
            {
              System.out.print(j+"\t");
            }
            }
            System.out.println();
          }
      
       }
      }