package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//Game : TRPG
		//법사
		String name="핫팩";
		int hp=20;
		int mp=20;
		
		String monsterName ="오크";
		int monsterHp = 10;
		
		System.out.println("1. HP 보충");
		System.out.println("2. MP 보충");
		System.out.println("3. 마법1 사용");
		System.out.println("4. 마법2 사용");
		System.out.println("5. 턴 종료 ");
		int select = sc.nextInt();
		
		if(select==1) {
			int h = random.nextInt(41);
			hp = hp+h;//20 30 => 50
			if(hp>40) {
				hp=40;
			}
			System.out.println(hp);
		}else if(select==2) {
			int m = random.nextInt(41);
			if(mp>40) {
				mp=40;
			}
			
		}else if(select==3) {
			int a = random.nextInt(6);
			monsterHp=monsterHp-a;
			//주문을 외우기
			//MP 3 감소
			//0 ~5이하의 수치를 공격
			System.out.println(name +"은(는) "+ monsterName +" 에게 "+a +" 데미지를 주었다" );
		}else if(select==4) {
			int a = random.nextInt(11);
			monsterHp = monsterHp-a;
			//주문을 외우기
			//MP 5 감소
			//0~10이하의 수치를 공격
			System.out.println(name +"은(는) "+ monsterName +" 에게 "+a +" 데미지를 주었다" );
		}else {
			System.out.println("턴을 넘깁니다");
		}
		
		//코드
		
		//유저의 이름과  HP, MP
		//몬스터의 이름과 HP
		System.out.println(name +" HP :"+hp +" MP : "+mp);
		System.out.println(monsterName + " HP : "+monsterHp);
		
		//1. HP보충(포션) 2. MP(보충) 3.마법1 4.마법2 5.턴을 넘기기
		//HP 는 최대 40이 끝
		//보충시 랜덤하게 0~40사이의 숫자를 받아서 HP에 더하기
		//MP 동일
		
		
//		int test = random.nextInt(5);//0 ~5 미만의 정수하나를 리턴
//		int test2 = random.nextInt(31);
//		System.out.println("test : "+test);
//		System.out.println("test2 : "+test2);
		
		
		
		
		

	}

}
