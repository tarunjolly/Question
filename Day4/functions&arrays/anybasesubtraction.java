import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
//   public static int getDifference(int b, int n1, int n2){
//       // write your code here
//       int p=1;
//       int newnum=0;
//       int flag=0;
//       while(n2>0)
//       {
//           int d2=n2%10;
//           int d1=n1%10;
//           if(flag==1)
//           {
//               if(d2==0)
//               {
//                   d2=b-1;
//               }
//               else
//               {
//                   d2=d2-1;
//                   flag=0;
//               }
//           }
//           int temp=d2-d1;
//           if(temp>=0)
//           {
//               newnum=newnum+p*(d2-d1);
//           }
//           else
//           {
//               newnum=newnum+p*(d2-d1+b);
//               flag=1;
//           }
//           p=p*10;
//           n1=n1/10;
//           n2=n2/10;
//       }
       
//       return newnum;
//   }

      public static int getDifference(int b, int n1, int n2){
        int newnum=0;
        int borrow=0;
        int p=1;
        
        while(n2>0)
        {
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            d2=d2-borrow;
            borrow=0;
            
            
            if(d2<d1)
            {   
                d2=d2+b;
                borrow=1;
            }
            
            newnum=newnum+(d2-d1)*p;
            p=p*10;
            
        }
        return newnum;
      }
          
          
          
      
      
  
  
  
  }