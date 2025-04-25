package ClassAndObject;

public class Employee {
	
	//
	String name;
	int age;
	double salary;
	boolean isPermanent;
	char gender;

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.name = "tom";
		e.age=50;
		e.salary=145.56;
		e.isPermanent=true;
		e.gender='m';
		
		System.out.println(e.name+" "+" "+e.age+" "+e.salary+ " "+e.isPermanent + " "+e.gender);//null

		Employee e1 = new Employee();
		
		System.out.println(e1.name+" "+" "+e1.age+" "+e1.salary+ " "+e1.isPermanent + " "+e1.gender);//null
		
		e1.name="test";
		
		System.out.println(e1.name);
	}

}
