
public class mirrorString {

	public static void main(String[] args) {
		
		String str="EARTH";
		
		String mirror=getImage(str);
		
		System.out.println(str+"|"+mirror);

	}

	private static String getImage(String str) {
		
		int i;
		String rev="";
		for(i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}

}
