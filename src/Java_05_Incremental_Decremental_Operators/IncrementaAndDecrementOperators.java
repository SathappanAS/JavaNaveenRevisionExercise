package Java_05_Incremental_Decremental_Operators;

public class IncrementaAndDecrementOperators {

	public static void main(String[] args) {
		
		//++ and --
		
		//1. post increment:
		int a =1;
		int b=a++;
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c = -99;
		int d = c++;
		System.out.println(c); //-98
		System.out.println(d); //-99
		
		
		int v = -56;
		int w = v++;
		
		System.out.println(v);//-55
		System.out.println(w);//-56
				
		
		//pre increment:
		int s =1;
		int q=++s;
		System.out.println(q); //2
		System.out.println(s); //2
		
		
		int t1=-99;
		int t2=++t1;
		System.out.println(t1); //-98
		System.out.println(t2); //-98
		

	}

}
