package IncrementalDecrementalRevisionExercise;

public class ProgramThree {

	public static void main(String[] args) {
		int i=0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);

	}

}
