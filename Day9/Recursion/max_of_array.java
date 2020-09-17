import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=scn.nextInt();
        
        System.out.println(maxOfArray(arr,0));
        //System.out.println(maxOfArraypre(arr,1));
        
    }
    
    public static int maxOfArraypre(int[] arr, int idx){
        //pre
        if(idx==arr.length)
        return 0;
        int ans=0;
        if(arr[idx]>arr[idx-1])
           ans=arr[idx];
        
        
         ans=maxOfArray(arr,idx+1);
        if(arr[idx]>ans)
        return arr[idx];
        else
        return ans;
        
    }
    
    public static int maxOfArray(int[] arr, int idx){
        //post
        if(idx==arr.length-1)
        return arr[idx];
        
        int ans=maxOfArray(arr,idx+1);
        if(ans>arr[idx])
        return ans;
        else
        return arr[idx];
    }

}