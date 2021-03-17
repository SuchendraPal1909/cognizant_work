
public class DuplicateList {

	public static void main(String[] args) {
		
		int[] arr= {1,2,50,50,2,3,6,14,1};
		
		
		  for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
		
		
	            }
		  }
	}

}
