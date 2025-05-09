package Java_10_LogrithmicTimeComplexity_LinearVsBinarySearch_StaticArrayConcept;

import java.util.Arrays;

public class ArraysConcept {
	public static void main(String[] args) {	
		//array:
		//Two Major Limitatioins:
		//1. Similar types of data only.
		//2. Size is fixed : static array: in order to solve it, we have to use dynamic array, collections, ArrayList
		
		
		//1. new keyword
		//2. array literals
		
		//int array:
		int i[]=new int[4];
		
		//i[-1]=500;//AIOB
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		//i[4]=500; // AIOB//Runtime exceptions
		
		System.out.println(i[0]); //100
		System.out.println(i[3]); //300
		//System.out.println(i[4]); //java.lang.ArrayIndexOutOfBoundsException: AIOB
		//System.out.println(i[-1]);//java.lang.ArrayIndexOutOfBoundsException: AIOB
		System.out.println(i.length); 
		
		int len = i.length;
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (len-1));
		System.out.println("length = " + len);
		
		System.out.println("=====index for loop=====");
		for(int e=0;e<=i.length-1;e++) {
			System.out.println(i[e]);
		}
		
		
		System.out.println("=====for each loop=====");
		for(int naveen:i) {
			System.out.println(naveen);
		}

		
		//---------------------------------------------------------//
		
		int p[] = new int[4]; //0-3 ; li - 0; hi=3;l=4
		System.out.println(Arrays.toString(p)); // [0,0,0,0]
		p[0]=10;
		p[3]=20;
		p[2]=30;
		System.out.println(p[1]); //0
		
		//i = array variable
		System.out.println(i); //[I@76fb509a = memory hashcode or memory address of the array (RAM)
		
		System.out.println(Arrays.toString(p));//Arrays - class // toString is the method of Arrays class . 
		//this is only for the view/printing purpose
		
		//---------------------------------------------------------//
		
		int price[]=new int[4];
		
		//i[-1]=500;//AIOB
		price[0]=100;
		price[1]=200;
		price[2]=300;
		price[3]=400;
		
		//print all the value of the array, iterate the arrays:
		
		for(int k=0;k<price.length;k++) {
			System.out.println(price[k]);
			if(price[k]==200) {
				System.out.println("bye!!!");
				break;
			}
		}
		//---------------------------------------------------------//
		
		//double array:
		
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=23.44;
		System.out.println(Arrays.toString(d));
		System.out.println(d.length); //2 = 16 bytes 
		
		//char array:
		
		char ch[]=new char[3]; //0-2
		System.out.println(String.valueOf(ch[0]).length());//2
		//[ , , ]--> ' '--> " "-->1
		 
		System.out.println(Arrays.toString(ch)); //  ,  ,  ]
		ch[0]='a';
		ch[1]='A';
		ch[2]='$';
		System.out.println(Arrays.toString(ch));
		
		System.out.println(ch.length);
		
		//boolean:
		boolean fg[] = new boolean[2];
		System.out.println(Arrays.toString(fg));//[false, false]

		fg[0] = true;
		//fg[1] = false;
		System.out.println(Arrays.toString(fg));//[true, false]


		//int, short, long, byte: 0
		//double, float: 0.0
		//boolean: false
		//char: space
		
		//String array:
		
		System.out.println("=====Day2=====");
		String browser[]=new String[4];
		System.out.println(Arrays.toString(browser));
		browser[0]="chrome";
		browser[1]="firefox";
		browser[2]="IE";
		browser[3]="safari";
		System.out.println(Arrays.toString(browser));
		
		
		//index for loop:
		for(int k=0;k<=browser.length-1;k++) {
			System.out.println(browser[k]);
			if(browser[k].equals("ie")) {
				System.out.println("IE");
				break;
			}
		}
		
		System.out.println("----------------------");
		
		//for each loop: enhanced for loop:
		
		for(String e : browser) {
			System.out.println(e);
			if(e.equals("ie")) {
				System.out.println("IE");
				break;
			}
		}
		
		
		//
		
		
		double dum[] = new double[3];//0-2
		dum[0] = 12.33;
		dum[1] = 23.44; 
		dum[2] = 33.44; 
		
		for(double e : dum) {
			System.out.println(e);
		}
		
		
		//
		
		char cht[] = new char[3]; //0-2
		cht[0] = 'a';
		cht[1] ='A';
		cht[2] = '$';	
		
		for(char e : cht) {
			System.out.println(e);
				if(e=='A') {
					System.out.println("bye");
					break;
				}
		}
		
	}

}
