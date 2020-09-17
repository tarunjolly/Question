import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      
      if(n==1)
      {
      System.out.println(1);
      return;
          
      }
      if(n==2)
      {System.out.println(1);
        System.out.println(2);
          return;
      }
      int a=0;
      int b=1;
      int c;
      for(int i=0;i<n;i++)
      { System.out.println(a);
        c=a+b;  
	a=b;
          b=c;
          
          
      }
   }
  }