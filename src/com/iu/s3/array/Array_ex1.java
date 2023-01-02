package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력 , iu, winter
		//3. 학생수 만큼 학생의 번호, 국어, 영어, 수학 입력
		//   iu 학생의 번호 :
		//   iu 학생의 국어 :
		//   iu 학생의 영어 :
		//   iu 학생의 수학 :
		//   총점 평균 계산
		
		//모든 학생의 정보 출력
		// 이름  번호  국어  영어  수학  총점 평균
		// iu   1     53  63   52   125 35.3
		// ...
		
		
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		String [] names = new String[count];
		int [] nums = new int [names.length];
		int [] kors = new int [names.length];
		int [] engs = new int [names.length];
		int [] maths = new int [names.length];
		int [] totals = new int [names.length];
		double [] avgs = new double[names.length];
		
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+" 번째 이름을 입력하세요");
			names[i] = sc.next();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" 의 번호 입력");
			nums[i]=sc.nextInt();
			System.out.println(names[i]+" 의 국어 입력");
			kors[i]=sc.nextInt();
			System.out.println(names[i]+" 의 수학 입력");
			maths[i]=sc.nextInt();
			System.out.println(names[i]+" 의 영어 입력");
			engs[i]=sc.nextInt();
			totals[i]=kors[i]+engs[i]+maths[i];
			avgs[i]=totals[i]/3.0;
		}
		
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" \t ");
			System.out.print(nums[i]+" \t ");
			System.out.print(kors[i]+" \t ");
			System.out.print(engs[i]+" \t ");
			System.out.print(maths[i]+" \t ");
			System.out.print(totals[i]+" \t ");
			System.out.println(avgs[i]);
		}
		
		
		
		
		
	}

}
