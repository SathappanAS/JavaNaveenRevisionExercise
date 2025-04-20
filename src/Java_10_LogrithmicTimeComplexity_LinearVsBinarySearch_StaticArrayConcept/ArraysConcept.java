package Java_10_LogrithmicTimeComplexity_LinearVsBinarySearch_StaticArrayConcept;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//array:
		//1. new keyword
		//2. array literals
		
		//int array:
		
		int i[]=new int[4];
		
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		//i[4]=500; // AIOB
		
		System.out.println(i[0]); //100
		System.out.println(i[3]); //300
		//System.out.println(i[4]); //java.lang.ArrayIndexOutOfBoundsException: AIOB
		System.out.println(i.length);
	}

}
