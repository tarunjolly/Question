import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int ques=scn.nextInt();
        ArrayList<String> ans=getStairPaths(ques);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0)
        {
            ArrayList<String> recans=new ArrayList<>();
            recans.add("");
            return recans;
            
        }
        ArrayList<String> output=new ArrayList<>();
        if(n-1>=0){
        ArrayList<String> ans1=getStairPaths(n-1);
            for(int i=0;i<ans1.size();i++)
            {
                output.add("1"+ans1.get(i));
            }
            
        }
        if(n-2>=0){
        ArrayList<String> ans2=getStairPaths(n-2);
            for(int i=0;i<ans2.size();i++)
            {
                output.add("2"+ans2.get(i));
            }
        }
        if(n-3>=0){
        ArrayList<String> ans3=getStairPaths(n-3);
            for(int i=0;i<ans3.size();i++)
            {
                output.add("3"+ans3.get(i));
            }
            
        }

        return output;
    }

}