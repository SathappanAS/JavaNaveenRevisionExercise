package Arrays;
//
public class ProgramTwo {

	public static void main(String[] args) {
		
		Object Sachin[] = new Object[5];
		
		Sachin[0]="sachin";
		Sachin[1]=29;
		Sachin[2]="india";
		Sachin[3]="10-10-1989";
		Sachin[4]=99.95;
		
		Object Dhoni[]=new Object[5];
		Dhoni[0]="Dohin";
		Dhoni[1]=27;
		Dhoni[2]="india";
		Dhoni[3]="07-10-1989";
		Dhoni[4]=99.35;
		
		for(int i=0;i<5;i++){
			System.out.println(Sachin[i] + " " + Dhoni[i]);
		}
		
		System.out.println("*********forLoop***************");
		for(Object e:Sachin) {
			System.out.println(e);
		}
		
		System.out.println("*********whileLoop***************");
		int i=0;
		while(i<5) {
			System.out.println(Sachin[i]);
			i++;
		}
		
		System.out.println("*********doWhileLoop***************");
		
		int j=0;
		do {
			System.out.println(Sachin[j]);
			j++;
		}while(j<5);
		

	}

}
