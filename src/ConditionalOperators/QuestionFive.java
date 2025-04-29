package ConditionalOperators;

public class QuestionFive {
/*WAP to check given alphaber character is Vowel or Consonant Using Switch - Case*/
	public static void main(String[] args) {
		char ch = 'e';
		
		//char ch = args[0].charAt(0);
		
		switch (ch) {
		case 'a':
			System.out.println(ch +  " is a vowel " );
			break;
		case 'e':
			System.out.println(ch +  " is a vowel " );
			break;
		case 'i':
			System.out.println(ch +  " is a vowel " );
			break;
		case 'o':
			System.out.println(ch +  " is a vowel " );
			break;
		case 'u':
			System.out.println(ch +  " is a vowel " );
			break;
		default:
			System.out.println(ch +  " is a Consonant " );
			break;
		}
		
	}

}
