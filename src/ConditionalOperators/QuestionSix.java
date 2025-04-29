package ConditionalOperators;

public class QuestionSix {
/*WAP to run your test cases in a specific environment like: QA,Stage,Dev,UAT, Prod using switch-Case*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Environment = "Stage";
		
		switch (Environment.toLowerCase().trim()) {
		case "qa":
			System.out.println("launch QA");
			break;
		case "stage":
			System.out.println("launch Stage");
			break;
		case "dev":
			System.out.println("launch Dev");
			break;
		case "uat":
			System.out.println("launch UAT");
			break;
		default:
			System.out.println("invalid browser, can't be lanuched");
			break;
		}

	}

}
