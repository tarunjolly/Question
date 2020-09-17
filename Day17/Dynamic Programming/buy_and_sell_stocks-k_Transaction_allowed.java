import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []price=new int[n];
        for(int i=0;i<n;i++)
        price[i]=scn.nextInt();
        
        int k=scn.nextInt();
        
        int[][]dp=new int[k+1][n];
        
        for(int i=1;i<=k;i++)
        {
            if(i==1)
            {
                int min=price[0];
                for(int j=1;j<n;j++)
                {
                    if(min>price[j]){
                        min=price[j];
                    }
                    dp[i][j]=Math.max(dp[i][j-1],price[j]-min);
                }
                
            }
            else
            {
                for(int j=1;j<n;j++)
                {
                    int max=0;
                    for(int x=0;x<j;x++)
                    {
                        int profit=price[j]-price[x]+dp[i-1][x];
                        if(max<profit){max=profit;}
                        
                    }
                    if(max<dp[i][j-1]){
                        max=dp[i][j-1];
                    }
                    dp[i][j]=max;
                }
            }
        }
        System.out.println(dp[k][n-1]);
        
    }

}