import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        int maze[][]=new int[row][col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                maze[i][j]=scn.nextInt();
            }
        }
        
        boolean [][] visited=new boolean[row][col];
        
        floodfill(maze,0,0,"",visited);
        
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited){
        
        if(row==maze.length-1 && col==maze[0].length-1)
        {
            System.out.println(psf); 
            return;
        }
        
        visited[row][col]=true;
        //top
        if(row-1>=0 && maze[row-1][col]!=1 && visited[row-1][col]==false)
        {  
            floodfill(maze,row-1,col,psf+"t",visited);
            
        }
        
        //left
        if(col-1>=0 && maze[row][col-1]!=1 &&visited[row][col-1]==false)
        {
            floodfill(maze,row,col-1,psf+"l",visited);
            
        }
        
        //bottom
        if(row+1<maze.length && maze[row+1][col]!=1 && visited[row+1][col]==false)
        {   
            floodfill(maze,row+1,col,psf+"d",visited);
            
        }
        
        //right
        if(col+1<maze[0].length  && maze[row][col+1]!=1 && visited[row][col+1]==false)
        {
            
                floodfill(maze,row,col+1,psf+"r",visited);        
            
        }
        visited[row][col]=false;
        
        
        
    }
}