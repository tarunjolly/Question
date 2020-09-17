import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int length=0;
        boolean [][]dp=new boolean[str.length()][str.length()];
        
        for(int gap=0;gap<dp.length;gap++)
        {
            for(int i=0,j=i+gap;j<dp[0].length;i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=true;
                }
                else if(gap==1)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        dp[i][j]=true;
                    }
                    else
                    {
                        dp[i][j]=false;
                    }
                }
                else
                {
                    if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true)
                    {
                        dp[i][j]=true;
                    }
                }
                
                if(dp[i][j]==true)
                {
                    length=gap+1;
                }
                
            }
        }
        System.out.println(length);
    }

}