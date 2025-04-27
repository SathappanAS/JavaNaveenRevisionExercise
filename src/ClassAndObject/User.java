package ClassAndObject;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		User u1=new User();
		
		u1.name="Sathappan";
		u1.age=36;
		u1.city="Chennai";
		System.out.println(u1.name +" "+ u1.age + " " + u1.city);
		
		User u2=new User();
		
		u2.name="Annamalai";
		u2.age=37;
		u2.city="USA";
		System.out.println(u2.name +" "+ u2.age + " " + u2.city);
		
		User u3=new User();
		u3.name="Test";
		u3.age=38;
		u3.city="Arizona";
		System.out.println(u3.name +" "+ u3.age + " " + u3.city);
		
		User u4=new User();
		u4.name="Master";
		u4.age=39;
		u4.city="Java";
		System.out.println(u4.name +" "+ u4.age + " " + u4.city);
		
		System.out.println("=====================================================****u1=u2********===================================");
		u1=u2;
		System.out.println(u1.name +" "+ u1.age + " " + u1.city);
		System.out.println(u2.name +" "+ u2.age + " " + u2.city);
		System.out.println(u3.name +" "+ u3.age + " " + u3.city);
		System.out.println(u4.name +" "+ u4.age + " " + u4.city);
		
		
		
		System.out.println("=====================================================****u2=u3********===================================");
		u2=u3;
		System.out.println(u1.name +" "+ u1.age + " " + u1.city);
		System.out.println(u2.name +" "+ u2.age + " " + u2.city);
		System.out.println(u3.name +" "+ u3.age + " " + u3.city);
		System.out.println(u4.name +" "+ u4.age + " " + u4.city);
		
		
		System.out.println("=====================================================****u3=u4********===================================");
		u3=u4;
		System.out.println(u1.name +" "+ u1.age + " " + u1.city);
		System.out.println(u2.name +" "+ u2.age + " " + u2.city);
		System.out.println(u3.name +" "+ u3.age + " " + u3.city);
		System.out.println(u4.name +" "+ u4.age + " " + u4.city);
		
		System.out.println("=====================================================****u3=u4********===================================");
		u4=u1;
		System.out.println(u1.name +" "+ u1.age + " " + u1.city);
		System.out.println(u2.name +" "+ u2.age + " " + u2.city);
		System.out.println(u3.name +" "+ u3.age + " " + u3.city);
		System.out.println(u4.name +" "+ u4.age + " " + u4.city);
	}

}
