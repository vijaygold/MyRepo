//Prime number!
/*
 *Hi how are u? 
 */
import java.lang.*;
import java.util.*;
class Prime
{
	public static void main(String a[]) throws Exception
	{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int n=s.nextInt();
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count=count+1;					
				}
			}
			if(count==2)
					System.out.println("given number is prime number");
			else
					System.out.println("given number is not Prime number");
			}
	}
	
			
