package Java_07_SwitchCaseUseCases_ShortCircuitOperators_Operator;

public class MaxNumber {

	public static void main(String[] args) {
		
		
		int x =100;
		int y = 200;
		int z = 300;
		
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
