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
        
        int x=scn.nextInt();
        //System.out.println(firstIndex(arr,0,x));
        System.out.println(firstIndexpre(arr,0,x));
    }

    public static int firstIndexpre(int[] arr ,int idx,int x)
    {
        if(idx==arr.length)
        return -1;
        
        if(arr[idx]==x)
        return idx;
        
        int ans=firstIndexpre(arr,idx+1,x);
        return ans;
    }
    
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
        return -1;
        
        int ans=firstIndex(arr,idx+1,x);
        if(x==arr[idx])
        {
            ans=idx;
        }
        
        return ans;
        
        //return 0;
    }

}