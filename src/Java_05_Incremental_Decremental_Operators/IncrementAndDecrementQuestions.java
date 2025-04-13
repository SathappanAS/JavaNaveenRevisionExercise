package Java_05_Incremental_Decremental_Operators;

public class IncrementAndDecrementQuestions {

	public static void main(String[] args) {
		
//		int i=11;
//		int j = i++ + ++i;
//		
//		System.out.println(i);
//		System.out.println(j);
		
		System.out.println("====================================");
		
		int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a); //13
		System.out.println("b="+b); //24
		System.out.println("c="+c); //103
		
		System.out.println("====================================");
		
//		int i=0;
//		int j = i++ - --i + ++i - i--;
//		
//		System.out.println(i); //0
//		System.out.println(j); //0
//		
//		System.out.println("====================================");
		
		
//		int i=19, j=29, k=9;
//		int m = i-- - j-- - k--;
//		System.out.println("i= " +i); //18
//		System.out.println("j= " +j); //28
//		System.out.println("k= " +k); //8
//		System.out.println(m); //-19
		
		
		int m=0,n=0;
		int p= --m * --n * n-- * m--;
		System.out.println(p); //1
		System.out.println(m); //-2
		System.out.println(n); //-2
		
		char v=97;
		int z=v++ - ++v;
		System.out.println(v);//c
		System.out.println(z);//-2
		
		
		
	}

}
