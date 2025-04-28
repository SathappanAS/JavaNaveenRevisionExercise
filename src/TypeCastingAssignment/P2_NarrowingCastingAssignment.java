package TypeCastingAssignment;
/*Develop a Java program to illustrate narrowing casting. Declare variables of higher data types like double, float, long, etc., and assign values to them. 
 * Then, cast these variables to lower data types like int, short, byte, etc. 
 * Print out the original and casted values to observe narrowing casting in action.*/
public class P2_NarrowingCastingAssignment {

	public static void main(String[] args) {
		double doubleValue = 45.75;
        float floatValue = 30.5f;
        long longValue = 1000000000L;
        
        float a = (float)doubleValue;
        short value2=(short)floatValue;
		int value3=(int)longValue;
		
		
		System.out.println(a);
		System.out.println(value2);
		System.out.println(value3);
	}

}
