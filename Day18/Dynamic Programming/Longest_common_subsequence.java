import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn=new Scanner(System.in);
        String str1=scn.nextLine();
        String str2=scn.nextLine();
        
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else 
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
         System.out.println(dp[dp.length-1][dp[0].length-1]);
    }

}