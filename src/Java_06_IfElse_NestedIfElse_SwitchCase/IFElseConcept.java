package Java_06_IfElse_NestedIfElse_SwitchCase;

public class IFElseConcept {

	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		
		// == comparision operator to compare two primitive data types
		// = assignment operator
		// to compare two strings (non primitive) data types -- we have to use .equals()
		
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
		//if-if-if else: nested if else
		int number = 20 ;
		if(number <= 100) {
			if(number>=95) {
				System.out.println("Grade A");
					if(number == 100) {
						System.out.println("Grade A++");
						System.out.println("eligible for MBA");
					}
			}
			else {
				if(number >=75) {
					System.out.println("Grade B");
				}
				else {
					System.out.println("Grade C");
				}
			}
		}
		else {
			System.out.println("...invalid marks...");
		}
		System.out.println("--------------------");	
		
//		String browser = "chrome";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch chrome");
//		}
//		else {
//			System.out.println("invalid browser... pls pass the right browser name...");
//		}
		
		
		
		String browser = "safari";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		} 
		else if(browser.equals("firefox")) {
			System.out.println(" launch firefox");
		}
		else if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("invalid browser.. pls pass the right browser name...");
		}

			
		
	}

}
