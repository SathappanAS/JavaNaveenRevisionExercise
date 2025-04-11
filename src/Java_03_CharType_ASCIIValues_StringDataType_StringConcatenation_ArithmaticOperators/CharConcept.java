package Java_03_CharType_ASCIIValues_StringDataType_StringConcatenation_ArithmaticOperators;
public class CharConcept {
	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);

		char c1 = 'a'; //97
		char c2 = 'b'; //98
		System.out.println(c1);
		System.out.println(c1+c2); //195
		
		
		//ASCII values:
		//a-z = 97 to 122
		//A-Z = 65 to 90
		//0-9 = 48 to 57
		
		System.out.println('a' + '0');//97+48
		
		char c3='e';
		System.out.println((int)c3);//101
		
		char c4= ' ';
		System.out.println((int)c4); //32
		
		int p='a';
		System.out.println(p); //97
		
		
		int q=66;
		System.out.println((char)q); //B
		
		//unicode --> ascii code + other symbolic + special chars
		
		char t = 67;
		System.out.println(t);
		
		char t1= 15006;
		System.out.println(t1);
	}

}
