import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		
		int n, rn=0, temp=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number : ");	
		n=s.nextInt();
		System.out.println("Given number : "+n);
		
		while(n!=0){
			temp=n%10;
			rn=(rn*10)+temp;
			n=n/10;			
		}
		
		System.out.println("Reverse of a Number : "+rn);
	}

}
