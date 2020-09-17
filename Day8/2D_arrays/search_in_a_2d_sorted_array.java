//easiest and efficient way and the best way with time complexity 2n
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
 //   int m=scn.nextInt();
    int [][] arr=new int[n][n];
    boolean flag=false;
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=scn.nextInt();            
        }
    }
    int x=scn.nextInt();
    
    int i=0;
    int j=n-1;
    while(i<n && j>=0)
    {
        
        if(arr[i][j]==x)
        {
            System.out.println(i);
            System.out.println(j);
            flag=true;
            break;
        }
        else if(arr[i][j]>x)
        {
            j--;
        }
        else
        {
            i++;
        }
        
    }
    if(!flag)
    {
        System.out.println("Not Found");
    }
        
    }

}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
 //   int m=scn.nextInt();
    int [][] arr=new int[n][n];
    boolean flag=false;
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=scn.nextInt();            
        }
    }
    int x=scn.nextInt();
    
    for(int i=0;i<n;i++)
    {   
        if(arr[i][n-1]<x)
        {
            continue;
        }
        
        for(int j=0;j<n;j++)
        {   
            
            if(arr[i][j]==x)
            {
                System.out.println(i);
                System.out.println(j);
                flag=true;
                break;
            }
        }
        if(flag)
        {
            break;
        }
    }
    
    if(!flag)
    System.out.println("Not Found");
        
        
        
    }

}