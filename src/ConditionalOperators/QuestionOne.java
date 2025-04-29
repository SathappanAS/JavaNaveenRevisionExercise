package ConditionalOperators;
/*Q1.a : Find out the greatest number out of three different given numbers:
 * 
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87

Expected Output : The greatest: 87
*/
public class QuestionOne {

	public static void main(String[] args) {
		
		int a = 100000;
		int b = 20000;
		int c = 3400;
		
		
		if(a>b && a>c) {
			System.out.println(" The greatest number : " + a);
		}
		else if(b>c) {
			System.out.println(" The greatest number : " + b);
		}
		else {
			System.out.println(" The greatest number : " + c);
		}
		
		
	}

}
