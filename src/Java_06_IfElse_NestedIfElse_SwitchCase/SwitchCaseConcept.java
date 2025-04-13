package Java_06_IfElse_NestedIfElse_SwitchCase;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = " CHROME ";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		default:
			System.out.println("invalid browser..pls pass the right browser name..");
			break;
		}

	}

}
