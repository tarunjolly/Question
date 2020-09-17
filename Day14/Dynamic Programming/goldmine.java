import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        
        int gold[][]=new int[row][col];
            for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            gold[i][j]=scn.nextInt();
        int ans=maxgold(gold);
        System.out.println(ans);
    }
    
    
    
    public static int maxgold(int [][]gold)
    {
        int dp[][]=new int[gold.length][gold[0].length];
        
        for(int j=dp[0].length-1;j>=0;j--)
        {
            for(int i=0;i<dp.length;i++)
            {
                
                if(j==dp[0].length-1)
                {
                    dp[i][j]=gold[i][j];
                    
                }
                else if(i==0)
                {
                    int max=Math.max(dp[i][j+1],dp[i+1][j+1]);
                    dp[i][j]=gold[i][j]+max;
                }
                else if(i==dp.length-1)
                {
                    int max=Math.max(dp[i][j+1],dp[i-1][j+1]);
                    dp[i][j]=gold[i][j]+max;
                }
                else
                {
                    int max=Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));
                    dp[i][j]=gold[i][j]+max;
                }
                
                
                
                
            }
            
        }
        
        int ans=dp[0][0];
        for(int i=1;i<dp.length;i++)
        {
            if(ans<dp[i][0])
            ans=dp[i][0];
        }
        return ans;
    }
    

}