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
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx>arr.length-1)
        {
            return;
        }
        
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}