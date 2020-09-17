import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){ arr[i]=scn.nextInt(); }
        int x=scn.nextInt();
         System.out.println(lastIndex(arr,0,x));
        //System.out.println(lastIndexpre(arr,0,x));
    }

    
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
        {
            return -1;
        }
        
        int ans=lastIndex(arr,idx+1,x);
         if(ans==-1)
         {  if(arr[idx]==x)
            { 
                ans=idx;
                return ans;
                
            }
            else
            {
             return ans;   
            }
             
         }
         else
         {
             return ans;
         }
         
        
        
    
    }
    
    public static int lastIndexpre(int[] arr, int idx, int x){
        if(idx==arr.length)
        {
            return -1;
        }
        int ans=-2;
        if(arr[idx]==x)
        {
            ans=idx;
        }
        
         int a=lastIndexpre(arr,idx+1,x);
         if(a==-1)
         {  
             if(ans!=-2)
             {
                 return ans;
             }
             
         }
         
             return a;
    }
    
    

}