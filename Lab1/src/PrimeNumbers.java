import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int i;
		for(i=1;i<=n;i++)
		{
			if(prime(i)==1)
				System.out.print(i+" ");

		}

	}

	private static int prime(int i) {
		int q,m,count=0;
		m=i;
		for(q=1;q<=m;q++)
		{
			if(m%q==0)
				count++;
			else
				continue;
		}
		if(count>2)
			return 0;
		else
			return 1;
	}

}

