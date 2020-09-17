import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int num=a>b?b:a;
        int gcd=0;
        int lcm=0;
        for(int i=1;i<=num;i++)
        {
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        
        lcm=(a*b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
      
     }
    }