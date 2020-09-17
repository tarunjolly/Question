import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int dp1[]=new int[n];
        int ans=0;
        dp1[0]=1;
        for(int i=1;i<n;i++)
        {   
            dp1[i]=1;
            int prevmax=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<=arr[i] && prevmax<dp1[j])
                {
                    prevmax=dp1[j];    
                }
                
            }
         //   if(prevmax+1>dp1[i])
            dp1[i]=prevmax+1;
        }
        
        int dp[]=new int[n];
     
        dp[0]=1;
        for(int i=n-1;i>=0;i--)
        {   
            dp[i]=1;
            int prevmax=0;
            for(int j=n-1;j>i;j--)
            {
                if(arr[j]<=arr[i] && prevmax<dp[j])
                {
                    prevmax=dp[j];    
                }
                
            }
           // if(prevmax+1>dp[i])
            dp[i]=prevmax+1;
        }
        
        int length=dp[0]+dp1[0]-1;
        for(int i=1;i<n;i++){
            length=Math.max(length,dp[i]+dp1[i]-1);
        }
        System.out.println(length);
        
        
        
    }

}