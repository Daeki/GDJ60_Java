package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력 받고
		//학생수 만큼 점수를 입력 받아서
		//총합계를 출력
		/**/
//		System.out.println("학생 수 입력");
//		int count = sc.nextInt();//3
//		int sum=0;
//		for(int i=0;i<count;i++) {
//			System.out.println(i);
//			int point = sc.nextInt();
//			sum = sum+point;
//			
//		}
//		System.out.println("합계 : "+sum);
		
		System.out.println("초를 입력하세요");//5
		int sec = sc.nextInt();
		
		for(int i=0;i<60;i++) {
			System.out.println(i+"초");
			if(sec==i) {
				i=59;
				break;
			}
		}
		
		System.out.println("종료");
	}

}
