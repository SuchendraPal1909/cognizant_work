import java.util.Arrays;
import java.util.Scanner;

public class arrayOfStringSort {

		
		public static String[] sortStrings(String arr[]){
			int i,j;
			String temp;
			for(i=0;i<arr.length;i++) {
				for(j=i+1;j<arr.length;j++) {
					if((arr[i].compareTo(arr[j]))>0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String[] arr=new String[5];
			System.out.println("Enter the array elements:");
			int i;
			for(i=0;i<arr.length;i++) {
				arr[i]=sc.nextLine();
			}
			
			System.out.println("The Unsorted array is : ");
			for(i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println();
			
			String[] sortArr=sortStrings(arr);
			System.out.println("The sorted array is:");
			for(i=0;i<sortArr.length;i++) {
				System.out.print(sortArr[i]+" ");
			}
			
		}

	}
