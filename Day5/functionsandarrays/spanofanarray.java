import java.io.*;
import java.util.*;
import java.lang.*;

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
    
    long min=arr[0];
    long max=arr[0];
    
    for(int i=0;i<size;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    
    
    System.out.print((max-min));
 }

}