/**
*Name:Suchendra Pal
*Description:demo of compilation and running java program
*Date:3/12/2021
*/

class reverse{
	public static void main(String[] args){
			int i,s=0,n=123456,r;
			int f=n;
			while(f>0)
			{
				r=f%10;
				s=(s*10)+r;
				f=f/10;
			}
			System.out.println(s);
			
	}
}