package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 모두 종료
		int m=0;
		int sec=5;
		boolean check=false;
		
		for(int b=0;b<60;b++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(b+" 분 "+ s +" 초");
				if(m==b&&sec==s) {
//					s=60;
//					b=60;
					check=true;
					break;
				}
			}//안쪽 for 끝
			if(check) {
				//b=60
				break;
			}
			
		}//바깥 for 끝
		
		System.out.println("프로그램 종료");
		
	}//main 끝

}//class 끝
