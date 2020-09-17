import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        int dp[][]=new int[2][n];
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                dp[0][i]=0;
                dp[1][i]=k;
            }
            else
            {
                dp[0][i]=dp[1][i-1];
                dp[1][i]=(dp[0][i-1]+dp[1][i-1])*(k-1);
            }
        }
        
        System.out.println(dp[0][n-1]+dp[1][n-1]);
    }
}