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
    
    int x=scn.nextInt();
    for(int i=0;i<size;i++)
    {
        if(arr[i]==x)
        {
            System.out.println(i);
            return;
        }
        
    }
    
    
    System.out.print(-1);
    
    
 }

}