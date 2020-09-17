import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int price[]=new int[n];
        for(int i=0;i<n;i++)
        price[i]=scn.nextInt();
        
        
        
        int min=price[0];
        int profit=0;
        
        
        for(int i=1;i<n;i++)
        {
            if(min>price[i])
            {
                min=price[i];
            }
            
            if(price[i]-min>profit)
            {
                profit=price[i]-min;
            }
        }
        
        System.out.println(profit);
    }

}