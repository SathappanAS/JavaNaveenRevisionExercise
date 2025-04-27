package IncrementalDecrementalRevisionExercise;

public class ProgramNine {

	public static void main(String[] args) {
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
		System.out.println(p);
		System.out.println(m);
		System.out.println(n);
	}

}
