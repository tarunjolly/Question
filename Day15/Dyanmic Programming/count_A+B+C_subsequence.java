import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner scn=new Scanner(System.in);
            String str=scn.nextLine();
            
            int dp[][]=new int[3][str.length()+1];
            
            for(int col=1;col<dp[0].length;col++)
            {
                if(str.charAt(col-1)=='a')
                {
                    dp[0][col]=2*dp[0][col-1]+1;
                    dp[1][col]=dp[1][col-1];
                    dp[2][col]=dp[2][col-1];
                }
                else if(str.charAt(col-1)=='b')
                {
                    dp[1][col]=2*dp[1][col-1]+dp[0][col-1];
                    dp[0][col]=dp[0][col-1];
                    dp[2][col]=dp[2][col-1];
                }
                else if(str.charAt(col-1)=='c')
                {
                    dp[2][col]=2*dp[2][col-1]+dp[1][col-1];
                    dp[1][col]=dp[1][col-1];
                    dp[0][col]=dp[0][col-1];
                }
            }
            System.out.println(dp[2][dp[0].length-1]);
    }
}




//another solution
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int acount = 0;
        int bcount = 0;
        int ccount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ''a''){
                acount = 2 * acount + 1;
            } else if(str.charAt(i) == ''b''){
                bcount = 2 * bcount + acount;
            } else if(str.charAt(i) == ''c''){
                ccount = 2 * ccount + bcount;
            }
        }

        System.out.println(ccount);
    }
}