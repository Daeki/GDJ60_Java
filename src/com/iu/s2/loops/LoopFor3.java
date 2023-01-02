package com.iu.s2.loops;

public class LoopFor3 {

	public static void main(String[] args) {
		//구구단 3단
		// 2*1=3	3*1
		// 2*2=6	3*2
		// 2*3=9	3*3
		// ...		...
		// 2*9=27	3*9=27
		for(int dan=2;dan<10;dan++) {
			for(int i=1;i<10;i++) {
				System.out.println(dan+ " * "+i +" = " + dan*i );
			}
			
		}

		

	}

}
