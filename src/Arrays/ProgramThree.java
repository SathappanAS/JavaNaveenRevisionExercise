package Arrays;

public class ProgramThree {

	public static void main(String[] args) {
		
		int p[]= {1,3,4,5,22,56,89,90};
		int len = p.length;
		System.out.println(len);
		
		System.out.println("======for loop======");
		
		for(int i=0;i<len;i++) {
			System.out.println(p[i]);
		}

		System.out.println("======for each loop======");
		
		for(int e:p) {
			System.out.println(e);
		}
		
		System.out.println("======while loop======");
		
		int i=0;
		while(i<len) {
			System.out.println(p[i]);
			i++;
		}
		
		System.out.println("======do while loop======");
		
		int j=0;
		do {
			System.out.println(p[j]);
			j++;
		}while(j<len);
		
	}

}
