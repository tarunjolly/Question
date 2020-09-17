import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int k=scn.nextInt();
        int temp=n;
        int count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        k=k%count;
        if(k<0)
        {
            k=k+count;
        }
        
        int newnum=0;
        while(k>0)
        {
            int emp=n%10;
            n=n/10;
            n=n+emp*(int)(Math.pow(10,count-1));
         //   count--;
            k--;
        }
        System.out.println(n);
        
    }
   }