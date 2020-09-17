import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    

    // write your code here
    Scanner scn=new Scanner(System.in);
    int size=scn.nextInt();
    int arr[]=new int[size];
    int space[]=new int[size];
    int max=0;
    for(int i=0;i<size;i++)
    {
        arr[i]=scn.nextInt();
        if(arr[i]>max)
        max=arr[i];
        
    }
    for(int i=0;i<size;i++)
    {
        space[i]=max-arr[i];
        
    }
    
    for(int i=1;i<=max;i++)
    {
        for(int j=0;j<size;j++)
        {
            if(space[j]==0)
            {
                System.out.print("*\t");
            }
            else
            {
                space[j]=space[j]-1;
                System.out.print("\t");
            }
                
        }
        System.out.println();
        
    }
    
    
    
    
 }

}