package TypeCastingAssignment;
/*Write a Java program that demonstrates widening casting. Create variables of different data types such as int, float, double, etc. 
 * Assign values to them and then cast them to a higher data type. 
 * Finally, print out the original and casted values to observe widening casting in action.*/



public class P1_WideningCastingAssignment {

	public static void main(String[] args) {
		int intValue = 10;
        float floatValue = 20.5f;
        double doubleValue = 30.75;
        
        long value=(long)intValue;
        double value1=(double)floatValue;
        long value2 = (long) doubleValue;
        
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println("*******************************");

	}

}
