import java.util.Scanner;

public class numberOfLineWordChar {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
		    //to take user input for string 
			System.out.println("Enter the string : ");
			String str=sc.nextLine();
			
			//to find number of lines,words,characters 
			int line=(str.split("[.]")).length;
			int word=(str.split(" ")).length+line-1;
			int character=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' '&& str.charAt(i)!='.')
					character++;
					
			}
			
			//to display number of lines,words,characters
			System.out.println("Number of lines : "+line);
			System.out.println("Number of words : "+word);
			System.out.println("Number of characters : "+character);
		
	}

}
