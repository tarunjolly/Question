import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    
    int n=scn.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++)
    arr[i]=scn.nextInt();
    
    int data=scn.nextInt();
    int floor=Integer.MIN_VALUE;
    int ceil=Integer.MAX_VALUE
;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>data)
        {
            if(ceil>arr[i])
            {
                ceil=arr[i];
            }
        }
        else if(arr[i]<data)
        {
            if(floor<arr[i])
            {
                floor=arr[i];
            }
        }
        else
        {
            ceil=data;
            floor=data;
            break;
        }
        
    }
    System.out.println(ceil);
    System.out.println(floor);
    
 }

}