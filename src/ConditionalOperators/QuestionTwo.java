package ConditionalOperators;

public class QuestionTwo {

	public static void main(String[] args) {

		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;

		if (a > b && a > b && a > c) {
			System.out.println("The greatest number : " + a);
		} else if (b > c && b > d) {
			System.out.println("The greatest number : " + b);
		} else if (c > d) {
			System.out.println("The greatest number : " + c);
		} else {
			System.out.println("The greatest number : " + d);
		}

	}
}