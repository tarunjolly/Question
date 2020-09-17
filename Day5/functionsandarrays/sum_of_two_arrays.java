import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    
    int size1=scn.nextInt();
    int arr1[] =new int[size1];
    
    for(int i=0;i<size1;i++)
    arr1[i]=scn.nextInt();
    
    int size2=scn.nextInt();
    int arr2[] =new int[size2];
    for(int i=0;i<size2;i++)
    arr2[i]=scn.nextInt();
    
    
    int size3=size1>size2?size1:size2;
    int output[] =new int[size3+1];
    int i=size1-1;
    int j=size2-1;
    int k=size3;
    int carry=0;
    while(i>=0 && j>=0)
    {
        int num=arr1[i]+arr2[j]+carry;
        output[k]=num%10;
        carry=num/10;
        i--;
        j--;
        k--;
    }
        while(i>=0)
    {
        int num=arr1[i]+carry;
        output[k]=num%10;
        carry=num/10;
        i--;
        k--;
    }
        while(j>=0)
    {
        int num=arr2[j]+carry;
        output[k]=num%10;
        carry=num/10;
        j--;
        k--;
    }

    output[0]=carry;
    for(int l=0;l<=size3;l++){
        if(l==0 && output[l]==0)
        {}
        else
        {
        System.out.println(output[l]);
        }
    }
    
 }

}