import java.util.*;
       
       public class Main{
       
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
       
            // write ur code here
            int rows=scn.nextInt();
            int upperows=(rows+1)/2;
            int lowerows=(rows/2);
            
            
            int upperstar=rows+1;
            int spaces=1;
            
            for(int i=1;i<=upperows;i++)
            {
                for(int j=1;j<=(upperstar)/2;j++)
                {
                    System.out.print("*\t");
                }
                for(int k=1;k<=spaces;k++)
                {
                    System.out.print("\t");
                }
                for(int j=1;j<=(upperstar/2);j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
                upperstar-=2;
                spaces+=2;
            }
            int lowerstar=upperstar+4;
            int lowerspaces=spaces-4;
            for(int i=lowerows;i>=1;i--)
            {   
                for(int j=1;j<=(lowerstar)/2;j++)
                {
                    System.out.print("*\t");
                }
                for(int k=1;k<=lowerspaces;k++)
                {
                    System.out.print("\t");
                }
                for(int j=1;j<=(lowerstar/2);j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
                lowerstar+=2;
                lowerspaces-=2;

            }
            
       
        }
       }