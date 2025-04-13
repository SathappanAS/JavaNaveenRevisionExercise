package Java_07_SwitchCaseUseCases_ShortCircuitOperators_Operator;

public class MaxNumber {

	public static void main(String[] args) {
		/*Very famous interview questions*/
		
		int x = 100;
		int y = 500;
		int z = 800;
		
		
		//&& -- short circuit operator
		//& 
		if(x>y && x>z) { 
			System.out.println("x is the greatest");
		}
		else if(y>z) {
			System.out.println("x is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
	}

}
