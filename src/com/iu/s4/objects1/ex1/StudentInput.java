package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	
	//findStudent 
	//학생배열을 받아서
	//학생의 번호를 입력받아서 일치하는 학생을 리턴 없으면 null
	public Student findStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력");
		int num=sc.nextInt();
		Student student = null;
		for(int i=0;i<students.length;i++) {
			if(num==students[i].num) {
				student = students[i];
				//return students[i];
			}
		}
		
		return student;
	}
	
	
	//setStudent
	//학생한명 객체를 생성해서, 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	public Student [] setStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름 입력");
		student.name=sc.next();
		System.out.println("번호 입력");
		student.num = sc.nextInt();
		System.out.println("국어 입력");
		student.kor = sc.nextInt();
		System.out.println("영어 입력");
		student.eng = sc.nextInt();
		System.out.println("수학 입력");
		student.math = sc.nextInt();
		
		student.total=student.kor+student.eng+student.math;
		student.avg = student.total/3.0;
		
		Student [] newStudents = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			newStudents[i]=students[i];
		}
		
		newStudents[students.length]=student;
		return newStudents;
	}
	
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	//총점 평균
	//학생 객체를 배열에 대입
	public void setAllStudents(Student [] students) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name=sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			
			student.total=student.kor+student.eng+student.math;
			student.avg = student.total/3.0;
			
			students[i]=student;
			
		}
		
	}

}
