import java.util.Scanner;

public class SearchSpecificValue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number you want to find:");
		int find=sc.nextInt();
		int count=0;
		
		for(int j=0;j<n;j++)
		{
			if(arr[j]==find)
			{
				count++;
			}

		}
		if(count>0)
			System.out.println("yes");
		else
			System.out.println("No");

	}

}
