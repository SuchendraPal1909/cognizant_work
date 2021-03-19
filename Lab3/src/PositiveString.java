import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=sc.next();
		
		boolean result=checkPositiveString(str);
		
		if(result==true)
			System.out.println(str+" : It is a positive String");
		else
			System.out.println(str+" : It is a negative String");
	}

	private static boolean checkPositiveString(String str) {
		int i,k=0,count=0;
		for(i=str.length()-1;i>0;i--)
		{
			k=i;
			if((Character.compare(str.charAt(k),str.charAt(k-1)))>0)
			{
				count++;
			}
		}
				
		if(count==str.length()-1)
			return true;
		else
			return false;
	}

}
