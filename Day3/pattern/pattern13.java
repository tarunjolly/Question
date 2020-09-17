//best solution
import java.util.*;
     
     public class Main{
         
      

     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
     
          // write ur code here
          int rows=scn.nextInt();
          int nos=1;
          int r=0;
          int n=0;
          int ncr=1;
          for(int i=1;i<=rows;i++)
          { r=0;
              for(int j=1;j<=nos;j++)
              {
                  //int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
                  
                  
                  
                  System.out.print(ncr+"\t");
                  ncr=ncr*(n-r);
                  ncr=ncr/(r+1);
                  r++;
              }
              ncr=1;
              n++;
              nos++;
              System.out.println();
          }
          
          
     
      }
     }






//slow ans 
import java.util.*;
     
     public class Main{
         
      public static int factorial(int n) {
        //1
        int fact = 1;
        //2
        for (int i = 1; i <= n; i++) {
            //3
            fact = fact * i;
        }
        //4
        return fact;
      }

     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
     
          // write ur code here
          int rows=scn.nextInt();
          int nos=1;
          int r=0;
          int n=0;
          for(int i=1;i<=rows;i++)
          { r=0;
              for(int j=1;j<=nos;j++)
              {
                  int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
                  r++;
                  
                  System.out.print(ncr+"\t");
              }
              n++;
              nos++;
              System.out.println();
          }
          
          
     
      }
     }