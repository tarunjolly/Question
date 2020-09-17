import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
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