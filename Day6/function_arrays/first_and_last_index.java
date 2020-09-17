import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    
    int size=scn.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=scn.nextInt();
    }
    int data=scn.nextInt();
    
    System.out.println(firstindex(arr,data));
    System.out.println(lastindex(arr,data));
 }
 
 
 public static int firstindex(int[] arr,int data)
 {
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(arr[mid]==data)
        {
            if(mid>0 && arr[mid-1]==arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        else if(arr[mid]<data)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
    }
    
    return -1;
 }


 
 public static int lastindex(int[] arr,int data)
 {
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(arr[mid]==data)
        {
            if(mid<arr.length-1 && arr[mid+1]==arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        else if(arr[mid]<data)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
    }
    
    return -1;
 }
}