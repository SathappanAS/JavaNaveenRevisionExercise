package Java_09_DoWhileLoop_NestedLoops_TimeComplexityConceptWithGraph;

public class NestedLoop {

	public static void main(String[] args) {
	
		
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
	
		//50 51 52 53 54 55
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(String.valueOf(i)+String.valueOf(j)+ " ");
			}
			System.out.println( "  " );
		}

	}

}
