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
        
        System.out.println(totalpaths(jumps));
    }
    
    
    
    
    public static int totalpaths(int [] jumps)
    {
        int dp[]=new int[jumps.length];
        dp[dp.length-1]=1;
        
        for(int i=dp.length-2;i>=0;i--)
        {
            int count=0;
            if(jumps[i]!=0)
            {   int currentcount=0;
                for(int j=i+1;j<dp.length && j<=i+jumps[i];j++)
                {
                    currentcount+=dp[j];
                }
                dp[i]=currentcount;
            }
        }
    
        return dp[0];
    }
    

}