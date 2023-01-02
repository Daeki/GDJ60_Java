package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {
	
	public static void main(String[] args) {
		//배그
		//총알 30발 -> 1탄창
		//캐릭터당  -> 3탄창
		
		//1. 단발
		//2. 점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복 출력
		
		Scanner sc = new Scanner(System.in);
		
		for(int t=1;t<4;t++) {
			System.out.println("1.단발   2.점사");
			int select = sc.nextInt();
			
			System.out.println(select);
			int count=10;
			String sound="타타탕";
			
			if(select==1) {
				sound="탕";
				count=30;	
			}
			
			for(int b=0;b<count;b++) {
				System.out.println(b+" 번째 소리 : "+sound);
			}
			
			
			System.out.println("탄창하나 소비");
		}
		
		
		
	}

}
