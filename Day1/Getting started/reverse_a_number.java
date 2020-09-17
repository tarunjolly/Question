import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn=new Scanner(System.in);
     int num=scn.nextInt();
     int newnum=0;
     while(num!=0)
     {
         System.out.println(num%10);
          newnum=newnum*10+num%10;
         num=num/10;
         
        
     }
     //reversed number
     //System.out.println(newnum);
    }
   }