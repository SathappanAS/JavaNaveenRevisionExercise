package Java_04_TypeCasting_Widening_Narrowing;

public class TypeCasting {
	public static void main(String[] args) {
		
		byte b = 10;
		short s=b;
		int i=s;
		long ln=i;
		System.out.println(s);
		
		
		//-128 to 127
		byte b1=10;
		byte b2=20;
		// byte b3=b1+b2;//30 (not allowed)
		
		int b3=b1+b2;
		
		
	}
	}

