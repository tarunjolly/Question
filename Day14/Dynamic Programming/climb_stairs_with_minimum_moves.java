import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
           Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []jumps=new int[n];
        
        for(int i=0;i<n;i++)
        {
            jumps[i]=scn.nextInt();
        }
        int ans=minpaths(jumps);
        if(ans==Integer.MAX_VALUE)
        {
            System.out.println("null");
        }
        else
        System.out.println(ans);
    }
    
    public static int minpaths(int []jumps)
    {
        int dp[]=new int[jumps.length];
        
        dp[dp.length-1]=0;
        
        for(int i=dp.length-2;i>=0;i--)
        {
            
            if(jumps[i]==0)
            {
                dp[i]=Integer.MAX_VALUE;
            }
            else
            {   
                    int mj=Integer.MAX_VALUE;
                for(int j=i+1;j<dp.length && j<=i+jumps[i];j++)
                {
                    if(mj>dp[j])
                    mj=dp[j];
                }
                if(mj==Integer.MAX_VALUE)
                dp[i]=mj;
                else
                {
                    dp[i]=mj+1;
                }
            }
            
        }
        
        return dp[0];
    }
    

}