import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
           // write ur code here
          int rows=scn.nextInt();
          int spaces=rows/2;
          int number=1;
          int nos=1;
          for(int i=1;i<=rows;i++)
          {
            for(int j=1;j<=spaces;j++)
            {
                System.out.print("\t");
            }
              int newnum=number;
            for(int k=1;k<=nos;k++)
            { 
              System.out.print(newnum+"\t");
              //number++;
              if(k<(nos+1)/2)
              {
                newnum++;
              }
              else
              {
                newnum--;
              }
              
            }
            if(i<(rows+1)/2)
            {
              number++;
              spaces--;
              nos+=2;
            }
            else
            {
              number--;
              spaces++;
              nos-=2;
            }

            System.out.println();
          }
      
       }
      }