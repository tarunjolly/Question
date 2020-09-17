import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     

    int p=1;
    int ans=0;
    while(n2>0)
    {
        int rem=n2%10;
        n2=n2/10;

        int temp=multiply(n1,rem,b);
        temp=temp*p;

        ans=addition(ans,temp,b);
        p*=10;
    }
    return ans;

     
 }

   public static int multiply(int n1,int rem,int b)
    {   int ans=0;
    int p=1;
    int carry=0;
    while(n1>0 || carry>0)
    {
        int temp=n1%10;
        int temp1=rem*temp+carry;
        carry=temp1/b;
        temp1=temp1%b;

        ans=ans+p*(temp1);
        p*=10;
        n1=n1/10;
    
    }
    return ans;
}
     public static int addition(int n1,int n2,int b)
    {
        int p=1;
        int carry=0;
        int ans=0;
        while(n1>0 || n2>0 || carry>0)
        {
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int temp=d1+d2+carry;
            carry=temp/b;
            temp=temp%b;

            ans=ans+temp*p;
            p*=10;


        }
        return ans;
}



}