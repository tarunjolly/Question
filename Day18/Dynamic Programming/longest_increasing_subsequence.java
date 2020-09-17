import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
        
        
        int dp[]=new int[n];
        int ans=0;
        dp[0]=1;
        for(int i=1;i<n;i++)
        {   
            dp[i]=1;
            int prevmax=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i] && prevmax<dp[j])
                {
                    prevmax=dp[j];    
                }
                
            }
            if(prevmax+1>dp[i])
            dp[i]=prevmax+1;
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<dp[i])
            max=dp[i];
        }
        
        System.out.println(max);
    }

}