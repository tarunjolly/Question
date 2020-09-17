import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
        Scanner scn=new Scanner(System.in);
        
        int size1=scn.nextInt();
        int[] arr1=new int[size1];
        for(int i=0;i<size1;i++)
        arr1[i]=scn.nextInt();
        
        int size2=scn.nextInt();
        int[] arr2=new int[size2];
        for(int i=0;i<size2;i++)
        arr2[i]=scn.nextInt();
        
        int output[]=new int[size2];
        int size3=size2;
        
        int i=size1-1;
        int j=size2-1;
        int k=size3-1;
        int borrow=0;
        while(i>=0 && j>=0)
        {
            int sub=arr2[j]-arr1[i]-borrow;
            borrow=0;
            if(sub<0)
            {
                sub=sub+10;
                borrow=1;
            }
            output[k]=sub;
            k--;
            j--;
            i--;
        }
        while(j>=0)
        {
            int sub=arr2[j]-borrow;
            borrow=0;
            if(sub<0)
            {
                sub=sub+10;
                borrow=1;
            }
            output[k]=sub;
            k--;
            j--;
            
        }

    int l=0;
    while(output[l]==0)
    {
        l++;
    }
    for(;l<size3;l++)
    {   if(output[0]==0 && l==0)
        continue;
        System.out.println(output[l]);
    }

 }

}