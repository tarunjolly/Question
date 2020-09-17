import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }       
            
        int h=0;    
        int inner=n;
        for(int i=0;i<arr.length;i++)
        {
            h=i;
            for(int j=0;j<inner;j++)
            {
                System.out.println(arr[j][h]);
                h++;
            }
            inner--;
            
        }
    }

}



//travel diagonally check the difference method
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
	
	for(int diff=0;diff<arr[0].length;diff++)
	{
		for(int i=0,j=diff;j<arrr[0].length;i++,j++)
		{
		System.out.println(arr[i][j]);
		}	
	}
}
}
