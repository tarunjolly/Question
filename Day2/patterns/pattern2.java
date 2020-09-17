import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
        int rows=scn.nextInt();
        int nos=rows;
        for(int cr=1;cr<=rows;cr++)
        {
            for(int c=1;c<=nos;c++)
            {
                System.out.print("*\t");
            }
            nos--;
            System.out.println();
        }
           // write ur code here
      
       }
      }