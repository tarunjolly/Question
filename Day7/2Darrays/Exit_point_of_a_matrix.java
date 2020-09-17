import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        
        int [][]arr=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        int direction=0;
        int r=0;
        int c=0;
        while(true)
        {   
            if(arr[r][c]==1)
            {
                direction++;
            }
            direction=direction%4;

            
             if(direction==0)
            {
                c++;
            }
            else if(direction==1)
            {
                r++;
            }
            else if(direction==2)
            {
                c--;
            }
            else if(direction==3)
            {
                r--;
            }
            
            
            
            if(r<0 || r==arr.length ||  c<0 || c==arr[0].length)
            {
                break;
            }
        }
        
        if(r<0)
        {
            r++;
        }
        else if(c<0)
        {
            c++;
        }
        else if(r==arr.length)
        {
            r--;
        }
        else if(c==arr[0].length)
        {
            c--;
        }
        
        System.out.println(r);
        System.out.println(c);
        
    }

}