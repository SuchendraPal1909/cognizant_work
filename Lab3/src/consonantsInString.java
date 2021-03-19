
public class consonantsInString {

	public static void main(String[] args) {
		
		String str1="JAVA";
		//String str=str1.toLowerCase();
		String finalStr=replaceConsonants(str1);
		
		System.out.println(finalStr);


	}

	private static String replaceConsonants(String str) {
		
		int i;
		str=str.toLowerCase();
		String str2="";
		char c=' ';
		for(i=0;i<str.length();i++)
		{	
			c=str.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
				str2=str2+c;
				}
			else
			{
				char m=((char)((int)c+1));
				str2=str2+m;
			}
		}
		return str2;
	}

}
