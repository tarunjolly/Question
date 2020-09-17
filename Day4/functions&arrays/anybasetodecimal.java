import java.util.*;
import java.lang.*;
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
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
  }