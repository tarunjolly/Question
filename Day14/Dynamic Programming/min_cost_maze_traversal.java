import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
        for(int j=0;j<col;j++)
        {arr[i][j]=scn.nextInt();
        }
            
        }
        
        int ans=mincostmaze(arr,row,col);
        System.out.println(ans);
    }
    
    
    public static int mincostmaze(int cost[][],int row,int col)
    {
        int dp[][]=new int[row][col];
        
        dp[0][0]=0;
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i==dp.length-1 && j==dp[0].length-1)
                {
                    dp[i][j]=cost[i][j];
                }
                else if(i==dp.length-1)
                {
                    dp[i][j]=cost[i][j]+dp[i][j+1];
                }
                else if(j==dp[0].length-1)
                {
                    dp[i][j]=cost[i][j]+dp[i+1][j];
                }
                else
                {
                    int mincost=Math.min(dp[i][j+1],dp[i+1][j]);
                    dp[i][j]=cost[i][j]+mincost;
                }
            }
        }
        
       
        return dp[0][0];
        
    }

}