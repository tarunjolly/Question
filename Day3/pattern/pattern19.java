import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int rows=scn.nextInt();
     for(int i=1;i<=rows;i++)
     {
         if(i==1)
         {  int j;
             for(j=1;j<=rows-1;j++)
             {
                    if(j<=(rows+1)/2)
                    {
                        System.out.print("*\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                    
             }
             System.out.print("*\t");
         }
         else if(i==rows)
         {
             int j;
             System.out.print("*\t");
             for(j=1;j<=rows-1;j++)
             {  
                    if(j<(rows)/2)
                    {
                        System.out.print("\t");
                    }
                    else
                    {
                        System.out.print("*\t");
                    }
                    
             }
         }
         else if(i==(rows+1)/2)
         {
             for(int j=1;j<=rows;j++)
             System.out.print("*\t");
         }
         else
         {
             for(int j=1;j<=rows;j++)
             {
                if(i<((rows+1)/2) && (j==(rows+1)/2 || j==rows ) )
                {
                    System.out.print("*\t");
                }
                else if(i>((rows+1)/2) && (j==(rows+1)/2 || j==1 ))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
             }
         }
         
         System.out.println();
     }
     

 }
}