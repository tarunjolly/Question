import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        String ques=scn.nextLine();
        
        printPermutations(ques,"");
        System.out.println("");

    }

    public static void printPermutations(String ques,String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            String roq=ques.substring(0,i)+ques.substring(i+1);
            printPermutations(roq,ans+ques.charAt(i));
            
        }
    }

}