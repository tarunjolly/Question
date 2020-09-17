import java.util.*;
          
          public class Main{
          
          public static void main(String[] args) {
              Scanner scn = new Scanner(System.in);
          
               // write ur code here
               int rows=scn.nextInt();
               int innerspaces=-1;
               int outerspaces=(rows)/2;

               
               for(int i=1;i<=rows;i++)
               {    
                   if(i==1 || i==rows){
                   for(int j=1;j<=outerspaces;j++)
                   {
                       System.out.print("\t");
                   }
                   System.out.print("*\t");
                   }
                   else
                   {
                        for(int j=1;j<=outerspaces;j++)
                        {
                            System.out.print("\t");
                        }
                        System.out.print("*\t");
                        for(int j=1;j<=innerspaces;j++)
                        {
                            System.out.print("\t");
                        }
                        System.out.print("*\t");
                   }
                   
                   if(i<(rows+1)/2)
                   {
                       innerspaces+=2;
                       outerspaces--;
                   }
                   else
                   {
                       outerspaces++;
                       innerspaces-=2;
                   }
                   
                    
                   
                   System.out.println();
               }
               
               
          
           }
          }