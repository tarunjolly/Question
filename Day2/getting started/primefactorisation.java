import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    while(n%2==0)
    {
        System.out.print(2+" ");
        n=n/2;
    }
    
    for(int i=3;i<(int)Math.sqrt(n);i+=2)
    {
        while(n%i==0)
        {
            System.out.print(i+" ");
            n=n/i;
        }
        
    }
    
    if(n%2!=0)
    System.out.println(n);
    
   }
  }

//or this is also correct
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
	int div=2;
	while(div*div<=n)
	{
		if(n%div==0)
		{
			System.out.print(div+" ");
			n=n/div;
		}
		else
		{
			div++;		

		}
	}
		if(n!=1)
		{
			System.out.println(n);
		}
    }
  }