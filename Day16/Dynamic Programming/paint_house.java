import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        
        int dp[][]=new int[3][n];
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                dp[0][0]=arr[0][0];
                dp[1][0]=arr[0][1];
                dp[2][0]=arr[0][2];
            }
            else
            {
                dp[0][i]=Math.min(dp[1][i-1],dp[2][i-1])+arr[i][0];
                dp[1][i]=Math.min(dp[0][i-1],dp[2][i-1])+arr[i][1];
                dp[2][i]=Math.min(dp[0][i-1],dp[1][i-1])+arr[i][2];
            }
        }
        
        System.out.println(Math.min(dp[0][n-1],Math.min(dp[1][n-1],dp[2][n-1])));
        
    }
}



//efficient 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] items = str.split(" ");
            arr[i][0] = Integer.parseInt(items[0]);
            arr[i][1] = Integer.parseInt(items[1]);
            arr[i][2] = Integer.parseInt(items[2]);
        }

        long red = arr[0][0];
        long blue = arr[0][1];
        long green = arr[0][2];

        for (int i = 1; i < arr.length; i++) {
            long nred = arr[i][0] + Math.min(blue, green);
            long nblue = arr[i][1] + Math.min(red, green);
            long ngreen = arr[i][2] + Math.min(red, blue);

            red = nred;
            blue = nblue;
            green = ngreen;
        }

        System.out.println(Math.min(red, Math.min(blue, green)));
    }
}