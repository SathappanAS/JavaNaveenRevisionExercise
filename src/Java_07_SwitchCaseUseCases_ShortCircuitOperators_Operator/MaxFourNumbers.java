package Java_07_SwitchCaseUseCases_ShortCircuitOperators_Operator;

public class MaxFourNumbers {

	public static void main(String[] args) {
		/*Very famous interview questions*/
		
		int a = 100;
		int b = 500;
		int c = 800;
		int d = 600;
		
		
		//&& -- short circuit operator
		//& 
		if(a>b && a>c && a>c) { 
			System.out.println("a is the greatest");
		}
		else if(b>c && b>d) {
			System.out.println("b is the greatest");
		}
		else if(c>d) {
			System.out.println("c is the greatest");
		}
		else {
			System.out.println("d is the greatest number");
		}
		

}}
