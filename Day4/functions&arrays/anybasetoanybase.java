import java.util.*;
import java.lang.*;
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      int d = getValueIndecimal(n, b1);
      int dn=   getValueInBase(d,b2);
      System.out.println(dn);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int temp;
      int newnum=0;
      int p=0;
      
      while(n>0)
      {
          temp=n%10;
          n=n/10;
          newnum=newnum + temp*((int)Math.pow(b,p));
          p++;
          
      }
      return newnum;
      
   }
   
      public static int getValueInBase(int n, int b){
       // write code here
       int temp;
       int newnum=0;
       int p=1;
       while(n>0)
       {
           temp=n%b;
           n=n/b;
           newnum=newnum+temp*p;
           p=p*10;
       }
       return newnum;
   }
  }