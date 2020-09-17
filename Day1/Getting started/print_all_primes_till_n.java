import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int i=low;i<=high;i++)
        {
            int flag=0;
        //    int n=scn.nextInt();
            double num; 
            num=Math.sqrt(i);
            
            int a=(int)num;
            
            for(int j=2;j<=a;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            
            
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}