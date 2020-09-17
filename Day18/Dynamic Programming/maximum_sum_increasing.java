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
        dp[0]=arr[0];
        for(int i=1;i<n;i++)
        {   
           
            int prevmax=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<=arr[i] && prevmax<dp[j])
                {
                    prevmax=dp[j];    
                }
                
            }
        
            dp[i]=prevmax+arr[i];
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