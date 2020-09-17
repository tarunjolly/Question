import java.util.*;
import java.lang.Math;
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        
        
       // write ur code here
        int t=scn.nextInt();
        while(t>0)
        {   int flag=0;
            int n=scn.nextInt();
            double num; 
            num=Math.sqrt(n);
            
            int a=(int)num;
            
            for(int i=2;i<=a;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==1)
            {
                System.out.println("not prime");
            }
            else
            {
                System.out.println("prime");
            }
            t--;
        }
   }
  }