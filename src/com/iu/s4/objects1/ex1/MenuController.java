package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		
		while(check) {
			System.out.println("1.등록");
			System.out.println("2.수정");
			System.out.println("3.삭제");
			System.out.println("4.종료");
			int select=sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("등록입니다");
				break;
			case 2:
				System.out.println("수정입니다");
				break;
			case 3:
				System.out.println("삭제입니다");
				break;
			default:
				System.out.println("종료합니다");
				check=false;
				break;
			}
			
		}
		
		
		
	}
	
	

}
