import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int p=1;
       int temp1=0;
       int carry=0;
       int newnum=0;
       while(n1>0 || n2>0 || carry>0)
       {    temp1=n1%10 + n2%10+carry;
            carry=temp1/b;
            temp1=temp1%b;
            newnum=newnum+p*temp1;
           p=p*10;
           n1=n1/10;
           n2=n2/10;
       }
       
       
       
       return newnum;
   }
  
  }