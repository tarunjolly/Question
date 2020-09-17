import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        int power=scn.nextInt();
        int ans= power(base,power);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;
        
        int ans=power(x,n-1);
        return ans*x;
    }

}