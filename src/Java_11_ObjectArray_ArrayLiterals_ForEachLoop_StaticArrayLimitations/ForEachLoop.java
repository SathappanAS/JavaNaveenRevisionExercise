package Java_11_ObjectArray_ArrayLiterals_ForEachLoop_StaticArrayLimitations;

public class ForEachLoop {

	public static void main(String[] args) {

		String browser[] = new String[5];

		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "ie";
		browser[3] = "safari";
		browser[4] = "edge";

		int count = 0;
		for (String e : browser) {
			System.out.println(count + " = " + e);
			count++;
		}

		System.out.println("--------------*****--------");

		// reverse the array : index loop:

		for (int k = browser.length - 1; k >= 0; k--) {
			System.out.println(browser[k]);
		}
		System.out.println("--------------*****--------");
		// reverse the array : using for each loop

		int c = browser.length - 1;
		for (String e : browser) {
			System.out.println(browser[c]);
			c--;
		}
		System.out.println("--------------*****--------");
	}

}
