import java.util.Scanner;

public class ModifyNumberString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		
			
		int result=modifyNumber(number);
		
		System.out.println(result);
	}

	private static int modifyNumber(int number) {
				
		String str=String.valueOf(number);
		
		int i;
		StringBuffer sb=new StringBuffer();
		
		
		for(i=0;i<str.length()-1;i++)
		{
			sb.append(Math.abs(((int)str.charAt(i))-((int)str.charAt(i+1))));
		}
		sb.append(str.charAt(str.length()-1));
		String str1=sb.toString();
		int c=Integer.parseInt(str1);
		
		return c;
	}

}
