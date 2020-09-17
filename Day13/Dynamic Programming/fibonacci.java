import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    //using rec
    //int ans=fibo(n);
    //System.out.println(ans);
    
    //using memoization
    //int memo[]=new int[n+1];
    //int ans1=fibomemo(n,memo);
    //System.out.println(ans1);
    
    //using dp
    int dp[]=new int[n+1];
    int ans2=fibomemo(n,dp);
    System.out.println(ans2);
    
 }
 
 
    public static int fibo(int n)
    {
        if(n==0 || n==1)
        return n;
        
        int nm1=fibo(n-1);
        int nm2=fibo(n-2);
        int myans=nm1+nm2;
        return myans;
    }
    
    public static int fibomemo(int n,int memo[])
    {
        if(n==0 || n==1)
        return n;
        else if(memo[n]!=0)
        return memo[n];
        
        int nm1=fibo(n-1);
        int nm2=fibo(n-2);
        int myans=nm1+nm2;
        memo[n]=myans;
        return myans;
    }
    
    public static int fibodp(int n,int dp[])
    {
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}