package Java_06_IfElse_NestedIfElse_SwitchCase;

public class IFElseConcept {

	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		
		// == comparision operator to compare two primitive data types
		// = assignment operator
		
		if(a==b) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
//		if(true) {
//			System.out.println("hii");
//		}
//		else {//dead code
//			System.out.println("bye");
//		}

		System.out.println("--------------------");
		boolean flag=true;
		
		if(flag) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		
		System.out.println("--------------------");	
		int number = 90;
		if(number <= 100) {
			if(number>=95) {
				System.out.println("Grade A");
			}
			else {
				System.out.println("Grade B");
			}
		}
		
		
	}

}
