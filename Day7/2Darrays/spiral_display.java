import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
         Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    int [][] arr=new int[n][m];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=scn.nextInt();            
        }
    }
   int i=0;
   int rs=0;
   int re=arr.length-1;
   int cs=0;
   int ce=arr[0].length-1;
   int noe=arr.length*arr[0].length;
   while(i<(noe))
   {
       for(int j=rs;j<=re && i<noe;j++)
       {
           System.out.println(arr[j][cs]);
           i++;
       }
       
       cs++;
       
       for(int j=cs;j<=ce && i<noe;j++)
       {
           System.out.println(arr[re][j]);
           i++;
           
       }
       re--;
       for(int j=re;j>=rs && i<noe;j--)
       {
           System.out.println(arr[j][ce]);
           i++;
       }
       
       ce--;
       for(int j=ce;j>=cs && i<noe;j--)
       {
           System.out.println(arr[rs][j]);
           i++;       }
       
       rs++;
       
   }
   
   
    }

}