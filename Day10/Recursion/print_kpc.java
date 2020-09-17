import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String num=scn.nextLine();
        String ans="";
        printKPC(num,ans);

    }

    public static void printKPC(String str,String ans) {
        
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        int a=str.charAt(0)-'0';
        String s=codes[a];
        
        
        for(int i=0;i<s.length();i++)
        {   
            printKPC(str.substring(1),ans+s.charAt(i));
        }
        
        
    }

}