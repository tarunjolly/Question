import java.util.*;
               
               public class Main{
               
               public static void main(String[] args) {
                   Scanner scn = new Scanner(System.in);
               
                    // write ur code here
                    int rows=scn.nextInt();
                    int upperows=(rows/2)+1;
                    int lowerows=(rows/2);
                    
                    int upperspace=upperows-1;
                    int lowerspace=1;
                    for(int i=1;i<=upperows;i++)
                    {
                        for(int k=1;k<=upperspace;k++)
                        {
                            System.out.print("\t");
                        }
                        upperspace--;
                        for(int j=1;j<=2*i-1;j++)
                        {
                            System.out.print("*\t");
                        }
                        System.out.println();
                        
                    }
                    
                    for(int i=lowerows;i>=1;i--)
                    {
                        for(int k=1;k<=lowerspace;k++)
                        {
                            System.out.print("\t");
                        }
                        lowerspace++;
                        for(int j=1;j<=2*i-1;j++)
                        {
                            System.out.print("*\t");
                        }
                        
                        System.out.println();
                    }
               
                }
               }