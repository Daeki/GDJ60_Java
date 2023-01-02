package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		//Sword의 Instance 생성
		int n=10;
		Sword s1 = new Sword();
		s1.name="집행검";
		s1.damage=50;
		s1.level=3;
		s1.life=500;
		
		Knight knight = new Knight();
		knight.name="물주먹";
		knight.hp=100;
		knight.staminer=50;
		knight.dex=30;
		knight.wiz=10;
		
		knight.sword=s1;
		
		System.out.println(knight.sword.name);
		
		//변수 선언
		Sword s2=null;
		
		System.out.println(s2.damage);
		
		

	}

}
