import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		System.out.println("Select the light:");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		}
		
		sc.close();
	}

}