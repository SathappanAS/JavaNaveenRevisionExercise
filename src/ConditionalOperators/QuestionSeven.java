package ConditionalOperators;

/*WAP to book the specific type of car from the Uber app using Switch - Case. 
a. Car Type: Mini, Sedan, SUV, Premium
b. If user passes wrong car type, print please select the right car type*/
public class QuestionSeven {

	public static void main(String[] args) {

		String UberCarType = "MINI";
		//String str = args[0];

		switch (UberCarType.toUpperCase().trim()) {
		case "SUV":
			System.out.println("Book SUV");
			break;
		case "MINI":
			System.out.println("Book MINI");
			break;
		case "SEDAN":
			System.out.println("Book SEDAN");
			break;
		case "PREMIUM":
			System.out.println("Book PREMIUM");
			break;
		default:
			System.out.println("print please select the right car type");
			break;
		}

	}

}