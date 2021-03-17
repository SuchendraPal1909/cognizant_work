import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[20];
		System.out.println("Enter 20 elements:");
		
		int i;
		for(i=0;i<20;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Final array is:");
		for(i=0;i<20;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int positiveNumber=checkPositive(arr);
		int negativeNumber=checkNegative(arr);
		int oddNumber=checkOddNumber(arr);
		int evenNumber=checkEvenNumber(arr);
		int zero=checkZero(arr);
		
		System.out.println("Number of positive numbers : "+positiveNumber);
		System.out.println("Number of negative numbers : "+negativeNumber);
		System.out.println("Number of odd numbers : "+oddNumber);
		System.out.println("Number of even numbers : "+evenNumber);
		System.out.println("Number of zero numbers : "+zero);
	}

	private static int checkZero(int[] arr) {
		int i,count=0;
		
		for(i=0;i<20;i++)
		{
			if(arr[i]==0)
				count++;
		}
		
		return count;
	}

	private static int checkEvenNumber(int[] arr) {
		int i,count=0;
		
		for(i=0;i<20;i++)
		{
			if(arr[i]%2==0)
				count++;
		}
		
		return count;
	}

	private static int checkOddNumber(int[] arr) {
		int i,count=0;
		
		for(i=0;i<20;i++)
		{
			if(arr[i]%2!=0)
				count++;
		}
		
		return count;
	}

	private static int checkNegative(int[] arr) {
		int i,count=0;
		
		for(i=0;i<20;i++)
		{
			if(arr[i]<0)
				count++;
		}
		
		return count;
	}

	private static int checkPositive(int[] arr) {
		int i,count=0;
		
		for(i=0;i<20;i++)
		{
			if(arr[i]>0)
				count++;
		}
		
		return count;
	}

}
