import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int price[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            price[i]=scn.nextInt();
        }
        int tfee=scn.nextInt();
        
        int buy=0-price[0];
        int sell=0;
        for(int i=1;i<n;i++)
        {   
            int nbuy=Math.max(sell-price[i],buy);
            int nsell=Math.max(price[i]+buy-tfee,sell);
            
            buy=nbuy;
            sell=nsell;
        }
        
        System.out.println(sell);
        
    }

}