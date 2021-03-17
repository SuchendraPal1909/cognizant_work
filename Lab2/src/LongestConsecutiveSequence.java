
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] originalArray= {49,1,3,200,2,4,70,5};
		int[] consecutiveArray=new int[originalArray.length];
		
		int i,j,round,temp,count=0;
		for(round=1;round<=originalArray.length;round++)
		{
			for(i=0;i<originalArray.length;i++)
			{
				for(j=i+1;j<originalArray.length;j++)
				{
					if(originalArray[i]>originalArray[j])
					{
						temp=originalArray[i];
						originalArray[i]=originalArray[j];
						originalArray[j]=temp;
					}
				}
			}
		}
		
		System.out.println("Array after sorting");
		for(i=0;i<originalArray.length;i++)
		{
			System.out.print(originalArray[i]+" ");
		}
		
		System.out.println();
		
		for(i=0;i<originalArray.length-1;i++)
		{
			if(originalArray[i+1]==originalArray[i]+1)
			{
				consecutiveArray[count]=originalArray[i];
				consecutiveArray[++count]=originalArray[i+1];
				count++;
				i++;
			}
			
		}
		
		System.out.println("Array of consecutive elements:");
		for(i=0;i<count;i++)
		{
			System.out.print(consecutiveArray[i]+" ");
		}
		if(count!=0)
		{
			System.out.print(consecutiveArray[count-1]+1);
		}
		
		System.out.println();
		System.out.println("Length: "+(count+1));

	}

}
