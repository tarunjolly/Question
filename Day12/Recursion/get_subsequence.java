import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String ques=scn.nextLine();
        ArrayList<String> ans= gss(ques);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> output=new ArrayList<>();
            output.add("");
            return output;
        }
        
        ArrayList<String> output=gss(str.substring(1));
        
        ArrayList<String> ans=new ArrayList<>();

        char ch=str.charAt(0);
        for(int i=0;i<output.size();i++)
        {
            ans.add(output.get(i));
        }
        
        for(int i=0;i<output.size();i++)
        {
            ans.add(ch+output.get(i));
        }
        
        
        return ans;
    }

}