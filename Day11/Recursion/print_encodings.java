import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String ques=scn.nextLine();
        printEncodings(ques,"");
        System.out.println("");
    }

    public static void printEncodings(String ques,String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        int num0=ques.charAt(0)-'0';
        if(num0==0)
        return;
        
        char code0=(char)(num0-1+'a');
        
        printEncodings(ques.substring(1),ans+code0);
        
        if(ques.length()>1)
        {
            int num1=ques.charAt(1)-'0';
            num1=num0*10+num1;
            
            if(num1<=26)
            {
                char code1=(char)(num1-1+'a');
                printEncodings(ques.substring(2),ans+code1);
            }
            
        }
        
        
    }

}