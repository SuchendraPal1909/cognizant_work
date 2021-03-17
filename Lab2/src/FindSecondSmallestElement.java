import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[10];
		System.out.println("Enter the elements of the array:");
		
		int i;
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int result=getSecondSmallest(arr);
		
		System.out.println("Second Smallest:"+result);

	}

	private static int getSecondSmallest(int[] arr) {
		
		int c=arr[1];
		
		return c;
	}

}
