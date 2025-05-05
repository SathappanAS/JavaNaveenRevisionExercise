package Arrays;

public class ProgramFour {

	public static void main(String[] args) {
	
		int p[]= {1,3,4,5,22,56,89,90};
		
		int len = p.length;
		System.out.println(len);
		
		System.out.println("======for loop======");
		
		for(int i=len-1;i>=0;i--) {
			System.out.println(p[i]);
		}
		
		System.out.println("======for each loop======");
		
		 int[] originalArray = {1, 2, 3, 4, 5};
	     int[] reversedArray = new int[originalArray.length];
		
	     int index = 0;
	        for (int i = originalArray.length - 1; i >= 0; i--) {
	            reversedArray[index++] = originalArray[i];
	            
	        }
	       
	        originalArray = reversedArray;

	        // Print the reversed array
	        for (int num : originalArray) {
	            System.out.print(num + " ");
	        }
	      

	}

}
