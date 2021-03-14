import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int f=sc.nextInt();
		
		System.out.println("the series is");
		fibonumber(f);
		}

	private static void fibonumber(int f) {
		
		int n,first=0,second=1,next,i;
		n=f;
		if(f<=2)
		{
			System.out.println(n);
		}
		else
		{
			for(i=0;i<n;i++)
			{
				System.out.println(first);
				next=first+second;
				second=first;
				first=next;
			}
		}
	}

}

