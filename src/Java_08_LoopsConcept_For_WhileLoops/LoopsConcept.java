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

		//odd/even
		
		int t=1;
		while(t<=10) {
			if(t%2==0) {
				System.out.println(t + " is an even number");
			}
			else {
				System.out.println(t + " is an old number");
			}
			t++;
		}
		
		System.out.println("=================For Loop ==========");
		
		//for loop:
		//1 to 10
		for(int k=1;k<=10;k++) {
			System.out.println(k);
			//k++;
			//++k;
			//k=k+1;
		}
		
		
		System.out.println("===========================");
		for(;;) {
			System.out.println("Bye!!");
			break;
		}
		
		//
		System.out.println("===========================");
		for(int n=10;n>=1;n--) {
			System.out.println(n);//10 9 8 7 6 5 3 2 1
		}
		System.out.println("===========================");
		for (int g=1;g<=10;g++) {
			System.out.println(g);
			if(g%5==0) {
				System.out.println("hello selenium");
				break;
			}
		}
		System.out.println("===========================");
		
		
		for(byte b=1;b<=5;b++) {
			System.out.println(b);
		}
		
		
		System.out.println("===========================");
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch + " = " + (int)ch);
		}
		
		System.out.println("===========================");
		
		for(double d=1.0;d<=5.0;d++) {
			System.out.println(d);
		}
		
		System.out.println("===========================");
		
		
	}

}
