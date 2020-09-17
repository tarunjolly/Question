import java.util.*;
import java.lang.Math;
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int count=0;
    int num1=num;
    while(num>0)
    
    {
        num=num/10;
        count++;
    }
    
    int p=count-1;
    while(p>0)
    {
        int n=(int)Math.pow(10,p);
        int temp=(int)num1/n;
        System.out.println(temp%10);
        p--;
    }
    System.out.println(num1%10);
    //System.out.println(count);
   }
  }