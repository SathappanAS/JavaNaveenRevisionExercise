package Java_11_ObjectArray_ArrayLiterals_ForEachLoop_StaticArrayLimitations;

import java.util.Arrays;

public class ObjectArray {
	public static void main(String[] args) {

		// Object Array : We are store different type of data

		// emp data:
		// name(String)
		// age(int)
		// salary(double)
		// gender(char)
		// isPermanent(boolean)

		// Object: is a super(parent) class

		Object empData[] = new Object[5];// 0-4
		System.out.println(Arrays.toString(empData));

		empData[0] = "Supriya";
		empData[1] = 30;
		empData[2] = 34.44;
		empData[3] = 'f';
		empData[4] = true;
		// empData[5] = "IBM";//AIOB

		System.out.println(empData[0]);
		System.out.println(empData.length);

		System.out.println(Arrays.toString(empData));

		for (Object e : empData) {
			System.out.println(e);
		}
		
		//ArrayList will increase and decrease the value automatically
	}

}