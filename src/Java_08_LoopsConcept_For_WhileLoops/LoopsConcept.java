package Java_08_LoopsConcept_For_WhileLoops;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// 1. while loop
		// 1 to 10:
		
		int i=1; //initialization
		while(i<=10) {  //condition checking
			System.out.println(i);
			//i++;
			//++i;
			i=i+1;
		}

		//
//		while(true) {
//			System.out.println("hi");
//		}
		
		int p=1;
		while(p<=10) {
			System.out.println(p);
			if(p==5) {
				System.out.println("Hello Selenium");
				break; //break is allowed only inside the loop. Break will always entire loop
			}
			p++;
		}

	}

}
