import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn=new Scanner(System.in);
int num=scn.nextInt();
int pow=1;
int newnum=0;
int number=1;
while(num>0)
{   pow=1;
	int temp=num%10;
	int a=num%10;
	while(a>1)
	{
	    pow=pow*10;
	    a--;
	}
	newnum=newnum+number*pow;
	number++;
	num=num/10;
 }
 System.out.println(newnum);
}
}