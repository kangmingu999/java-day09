 package variable;

import java.util.Scanner;

public class Test {

Scanner sc = new Scanner(System.in);
public String name, grade;{
	System.out.println("이름을 입력하세요 : ");
	name = sc.next();
}
public int kor, eng, math, sum;{
	System.out.println("국어 점수 :");
	kor = sc.nextInt();
	System.out.println("영어 점수 :");
	eng = sc.nextInt();
	System.out.println("수학 점수 :");
	math = sc.nextInt();
	sum = kor + eng + math;
	System.out.println("합계 : "+sum);
	
}
public double avg;{
	avg = sum/3;
	System.out.println("평균 : "+ avg);
	if(avg>=90) {
		System.out.println("A");
	}
	if(90>avg && avg>=80) {
		System.out.println("B");
	}
	else {
		System.out.println("c");
	}
	
}

	

	
}

