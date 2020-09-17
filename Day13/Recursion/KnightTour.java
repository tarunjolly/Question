import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int row=scn.nextInt();
        int col=scn.nextInt();
        int chess[][]=new int[n][n];
        
        printKnightsTour(chess,row,col,1);
        System.out.println();
        
    }

    public static void printKnightsTour(int[][] chess, int r,int c,int next) {
        if(next==chess.length*chess[0].length)
        {   chess[r][c]=next;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        //  if(r>=chess.length||c>=chess[0].length||r<0||c<0){
        //     return;
        // }
            
        //     if(chess[r][c]==0)
        //     chess[r][c]=next;
        //     else
        //     return;
        
            chess[r][c]=next;
            
            if(r-2>=0 && c+1<chess[0].length && chess[r-2][c+1]==0){
            printKnightsTour(chess,r-2,c+1,next+1);
                
            }
            
            if(r-1>=0 && c+2<chess[0].length && chess[r-1][c+2]==0){
            printKnightsTour(chess,r-1,c+2,next+1);
                
            }
            
            if(r+1<chess.length && c+2<chess[0].length && chess[r+1][c+2]==0){
            printKnightsTour(chess,r+1,c+2,next+1);
                
            }
            
            if(r+2<chess.length && c+1<chess[0].length && chess[r+2][c+1]==0){
            printKnightsTour(chess,r+2,c+1,next+1);
                
            }
            
            if(r+2<chess.length && c-1>=0 && chess[r+2][c-1]==0){
            printKnightsTour(chess,r+2,c-1,next+1);
                
            }
            
            if(r+1<chess.length && c-2>=0 && chess[r+1][c-2]==0){
            printKnightsTour(chess,r+1,c-2,next+1);
                
            }
            
            if(r-1>=0 && c-2>=0 && chess[r-1][c-2]==0){
            printKnightsTour(chess,r-1,c-2,next+1);
                
            }
            
            if(r-2>=0 && c-1>=0 && chess[r-2][c-1]==0){
            printKnightsTour(chess,r-2,c-1,next+1);
            
                
            }
            
            
            chess[r][c]=0;
            
            
            //return;
        }
        
        
        
        
        
        
        
    

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}



//another method

public static void printKnightsTour(int[][] chess, int r,int c,int next) {
       
        if(r>=chess.length||c>=chess[0].length||r<0||c<0){
            return;
        }
        
            if(chess[r][c]!=0)
            return;
            
        if(next==chess.length*chess[0].length)
        {
            chess[r][c]=next;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        
            
            chess[r][c]=next;
            
            
            printKnightsTour(chess,r-2,c+1,next+1);
            printKnightsTour(chess,r-1,c+2,next+1);
            printKnightsTour(chess,r+1,c+2,next+1);
            printKnightsTour(chess,r+2,c+1,next+1);
            printKnightsTour(chess,r+2,c-1,next+1);
            printKnightsTour(chess,r+1,c-2,next+1);
            printKnightsTour(chess,r-1,c-2,next+1);
            printKnightsTour(chess,r-2,c-1,next+1);
            
            chess[r][c]=0;
            
            
            //return;
        }
        
        