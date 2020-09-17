import java.io.*;
import java.util.*;

public class program1{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    
    int size=scn.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
        arr[i]=scn.nextInt();
    }
    int x=scn.nextInt();
    int ans=-1;
   int start=0;
   int end=arr.length-1;
   int mid=(start+end)/2;
   while(start<end)
   {    mid=(start+end)/2;
        if(arr[mid]==x)
        {
            ans=mid;
            break;
        }
        else if(arr[mid]>x)
        {
            end=mid-1;

        }
        else
        {
            start=mid+1;
        }

   }
   System.out.println(ans);
    
 }

}