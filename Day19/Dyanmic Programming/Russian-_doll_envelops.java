import java.io.*;
import java.util.*;

public class Main {

    static class pair implements Comparable<pair>{
        int sp;
        int ep;
        
        public int compareTo(pair other){
            if(this.sp!=other.sp)
            {
                return this.sp-other.sp;
            }
            else{
                return this.ep-other.ep;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pair[] bridges=new pair[n];
        
        for(int i=0;i<n;i++)
        {
            pair bridge=new pair();
            bridge.sp=scn.nextInt();
            bridge.ep=scn.nextInt();
            
            bridges[i]=bridge;
        }
        
        Arrays.sort(bridges);
        
        int [] dp=new int[n];
        dp[0]=1;
        
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(bridges[i].ep>=bridges[j].ep && max<dp[j])
                {
                    max=dp[j];
                }
            }
            dp[i]=max+1;
        }
        
        int ans=dp[0];
        for(int i=1;i<n;i++)
        {
            ans=Math.max(ans,dp[i]);
        }
        System.out.println(ans);
        
    }


}


