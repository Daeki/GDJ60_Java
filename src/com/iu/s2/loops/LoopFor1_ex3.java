package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		int check=0;
		
		//로그인 시도 총 5번 시도가능
		int i=0;
		for(;i<5;i++) {
			System.out.println("ID를 입력");
			int yId = sc.nextInt();
			System.out.println("Pw를 입력");
			int yPw = sc.nextInt();
			
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				check=1;
				i=1000;
				break;
			}else {
				System.out.println("로그인 실패");
			}

		}
		
		if(i>1000) {
			System.out.println("환영합니다");
		}else {
			System.out.println("은행을 방문 하세요");
		}
		
		System.out.println("반복문 종료");
		//반복문 종료 후
		//로그인이 성공 했으면 "환영합니다" 출력
		//로그인이 실패 했으면 "은행을 방문하세요" 출력
		
		

	}

}
