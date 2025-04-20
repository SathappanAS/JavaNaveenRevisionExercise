package Java_11_ObjectArray_ArrayLiterals_ForEachLoop_StaticArrayLimitations;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//literals: data is already with us
		//still static array
				int a[] = {10,20,30,40,50};//0-4
				System.out.println(a.length);
				System.out.println(a[2]);
				
				//a[5] = 60;//AIOB
				//System.out.println(a[5]);
				
				int i[] = new int[40]; 
				i[0] = 10;
				i[1] = 20;
				
				String lang[] = {"Java", "JS", "Python", "TS"};
				System.out.println(Arrays.toString(lang));
				System.out.println(lang.length);
				lang[0] = "Ruby";
				System.out.println(Arrays.toString(lang));

				//Month[12]
				//AL---> 12, 40, 50

	}

}
