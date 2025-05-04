package Arrays;

import java.util.Arrays;

public class ProgramOne {

	public static void main(String[] args) {
		int p[]={1,4,5,2,3,22,31,2};
		int a[]=new int[p.length-1]; 
		System.out.println(Arrays.toString(p));
		System.out.println(p.length);
		System.out.println("-------");
		System.out.println(p[5]);
		
		int m = -1;
		for(int i=0;i<p.length;i++) {
				if(p[i]==22) {
					m =i;
					break;
				}
			
		}
		
		if (m != -1) {
			while(m != (p.length-1) ) {
				p[m] = p[m+1];
				m++;
			}
		}
		
	
		for(int i=0;i<p.length-1;i++) {
			System.out.println(p[i] + " ");
		}
		System.out.println(Arrays.toString(p));
	}

	}