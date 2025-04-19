package Java_09_DoWhileLoop_NestedLoops_TimeComplexityConceptWithGraph;

public class NestedLoopProgram {
/* 000 001 002 003 004 005
 * 100 101 102 103 104 105
 * 200 202 202 203 204 205
 * 
 * 500 501 502 503 504 505
 * */
	public static void main(String[] args) {
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				if(j==0) 
				{
				for(int k=0;k<=5;k++) {
					System.out.print(i + "" + j + "" + k +  " " );
				}
				System.out.println(" ");
				}
				
			}
		}

	}

}
