import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int dp[]=new int[n+1];
        
        System.out.println(stairpath(n,dp));
    }
    
    
   public static int stairpath(int n,int dp[])
    {
        if(n==0)
        return 1;
        
        dp[0]=1;
        
        for(int i=1;i<=n;i++)
        {
            int count=0;
            if(i-1>=0)
            count+=dp[i-1];
            
            if(i-2>=0)
            count+=dp[i-2];
            
            if(i-3>=0)
            count+=dp[i-3];
            
            dp[i]=count;
        }
        return dp[n];
    }

}