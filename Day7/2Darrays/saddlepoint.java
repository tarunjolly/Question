import java.io.*;
import java.util.*;

public class Main {
    
    public static int saddlepoint(int arr[][])
    {   
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minindex=-1;
        for(int i=0;i<arr.length;i++)
        {   
             min=Integer.MAX_VALUE;
             max=Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    minindex=j;
                }
            }
            
            for(int k=0;k<arr.length;k++)
            {
                if(arr[k][minindex]>max)
                {
                    max=arr[k][minindex];
                }
            }
            
            if(min==max)
            {
                return min;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        int ans=saddlepoint(arr);
        if(ans!=-1)
        System.out.println(ans);
        else
        {
            System.out.println("Invalid input");
        }
    }

}