import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the number:");
		   int n=sc.nextInt();
		   
		   int result=Sumc(n);
		   
		   System.out.println("sum of the cubes of this number is:"+result);
		   sc.close();
	}

	private static int Sumc(int n) {
		int r,s=0,f;
		f=n;
		while(f>0)
		{
			r=f%10;
			s=s+(r*r*r);
			f=f/10;
		}
		return s;
	}

}