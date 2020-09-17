import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    int c=scn.nextInt();
    int ans=(a*a+b*b)==c*c?1:0;
    int ans1=(b*b+c*c)==a*a?1:0;
    int ans3=(a*a+c*c)==b*b?1:0;
    if(ans==1 || ans1==1 || ans3==1)
    System.out.println("true");
    else
    System.out.println("false");
   }
  }