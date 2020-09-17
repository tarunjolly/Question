import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String ques=scn.nextLine();
        
        ArrayList<String> ans=getKPC(ques);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        
    String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    if(str.length()==0)
    {
        ArrayList<String> recans=new ArrayList<>();
        recans.add("");
        return recans;
    }
    
    ArrayList<String> recans=getKPC(str.substring(1));
    ArrayList<String> ans=new ArrayList<>();

    int a=str.charAt(0)-'0';
    
    String s=codes[a];
    for(int j=0;j<s.length();j++)
    {
    for(int i=0;i<recans.size();i++)
    {
        ans.add(s.charAt(j)+recans.get(i));
    }
    
        
    }
    
        return ans;
    }

}