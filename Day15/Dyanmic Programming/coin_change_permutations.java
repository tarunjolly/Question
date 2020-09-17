import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++)
        coins[i]=scn.nextInt();
        
        int amt=scn.nextInt();
        
        System.out.println(coinchange(coins,amt));
        
        
    }
    public static int coinchange(int    coins[],int amt)
    {
        int dp[]=new int[amt+1];
        //base case
        dp[0]=1;
        
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++)
            {
                if(i-coins[j]>=0)
                {
                    dp[i]+=dp[i- coins[j]];
                }
            }
        }
        
        return dp[amt];
        
        
    }
    
    
}