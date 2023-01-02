package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// MMORPG 게임
		//1.로그인
		//2.로그인 한 사용자만 게임 가능
		
		//----------------  로그인 파트 ----------------------
		//1.로그인 2.종료
		//	1: id, pw 입력 후 로그인 판단
		//  2: 종료
		boolean check=true;
		int id=1234;
		int pw=5678;
		
		while(check) {
			System.out.println("1.로그인   2.종료");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("ID 입력");
				int yId=sc.nextInt();
				System.out.println("PW 입력");
				int yPw=sc.nextInt();
				
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
				
				
			}else {
				System.out.println("종료합니다");
				check=!check;
				check=false;
			}
			
		}
		
		System.out.println("Check : "+check);
		
		if(check) {
			
			int level=1;
			int gold=0;
			
			for(level=1;level<15;level++) {
				System.out.println("현재 레벨 : "+level);
				
				if(level%5==0) {
					System.out.println(level +" 랩 달성 축하금");
					gold = gold+ level/5*1000;
				}
				
//				if(level==5) {
//					System.out.println("5렙 달성 축하금");
//					gold = gold+1000;
//				}
//				
//				if(level==10) {
//					System.out.println("10렙 달성 축하금");
//					gold=gold+2000;
//				}
//				
				
				for(int m=0;m<level*3;m++) {
					System.out.println(m+1+" 번째 사냥 성공");
				}
				
				
				System.out.println("축 레벨업");
			}//바깥 for
			System.out.println(level + " 렙 달성 축하");
			gold = gold+level/5*1000;
			System.out.println("Gold : "+gold);
		
			
			
			
			
		}
		
		//---------------- 게임 진행 파트 --------------------
		//1.로그인 성공 했을 때 진행
		//레벨은 1로 시작
		//GOLD는 0
		//5렙 달성시 1000GOLD지급
		//10렙 달성시 2000GOLD지급
		//15레 달성시 3000GOLD지급
		//모든 몬스터의 경험치는 동일
		//1 -> 2 : 3
		//2 -> 3 : 6
		//3 -> 4 : 9
		//4 -> 5 : 12
		// ...
		//14 -> 15:42
		//만랩달성 축하, 현재 GOLD 출력
		
		
		

	}

}
