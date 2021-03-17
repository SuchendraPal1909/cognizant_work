import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList<Integer> arrlist=new ArrayList<Integer>(5);
		
		System.out.println("Enter the elements in ArrayList:");
		for(int i=0;i<5;i++)
		{
			arrlist.add(sc.nextInt());
		}
		
		int[] arr=new int[5];
		for(int j=0;j<5;j++)
		{
			arr[j]=arrlist.get(j);
		}
		
		System.out.println("Array is:");
		for(int k=0;k<5;k++)
		{
			System.out.print(arr[k]+" ");
		}
			

	}

}
