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
        //displayArrReverse(arr,size-1);
        displayArrReversepost(arr,0);
    }

    // public static void displayArrReverse(int[] arr, int idx) {
    //   //prearea
    //     if(idx<0)
    //     return;
    //     System.out.println(arr[idx]);
    //     displayArrReverse(arr,idx-1);

    // }
    
    public static void displayArrReversepost(int[] arr, int idx) {
        //post area
        if(idx==arr.length)
        return;
        
        displayArrReversepost(arr,idx+1);
        System.out.println(arr[idx]);
    }

}