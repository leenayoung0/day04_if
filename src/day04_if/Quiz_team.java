package day04_if;

import java.util.Scanner;

public class Quiz_team {
	public static void main(String[] args) {
		//1. 정수 한 개를 입력받아서, 
		//그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		if (num >= 50) System.out.println(num+"은 50 이상의 수");
		else if (num < 50) System.out.println(num+"은 50 미만의 수");
		
		//2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보세요
		
		int n;
		System.out.println("\n정수 입력: ");
		n = sc.nextInt();
		if(n%3==0) System.out.println(n+"은 3의 배수\n");
		else if(n%3!=0) System.out.println(n+"은 3의 배수가 아님\n");
		
		//3. 세 수 kor, eng, math를 입력받아 평균이 90이상이면 A,
		// 80이상이면 B, 70점 이상이면 C, 70미만이면 D를 출력하시오.
		int kor, eng, math;
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum /3;
		
		System.out.println("평균: "+avg);
		
		if(avg>=90)System.out.println("등급: A");
		else if(avg>=80)System.out.println("등급: B");
		else if(avg>=70)System.out.println("등급: C");
		else System.out.println("등급: D");
		
		//4. 정수 세개를 입력받아 최대값 및 최소값 구하기
		
		System.out.print("\n세 정수 입력: ");
		int n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int max=0;
		if (n1>n2) max =n1;
		if (n2>n1) max= n2;
		if (n3>max) max=n3;
		
		int min=0;
		if (n1<n2) min=n1;
		if(n2<n1) min=n2;
		if(n3<min) min=n3;
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		//5. 정수 한 개를 입력 받아서 강의실번호 출력하기
		// 과목은 1.수학 2.과학 3.영어 4.역사 
		// code값은 1이면 "101호" 2이면 "102호", 3이면 "203호",
		// 4이면 "202호", 나머지 5부터는 "상담원에게 문의"
		int a;
		System.out.print("\n<과목번호>\n1.수학 2.과학 3.영어 4.역사\n과목번호 입력 :");
		
		a = sc.nextInt();
		if(a==1)System.out.println("강의실: 101호");
		else if(a==2)System.out.println("강의실: 102호");
		else if(a==3)System.out.println("강의실: 203호");
		else if(a==4)System.out.println("강의실: 202호");
		else System.out.println("상담원에게 문의");
		
		
		
		sc.close();	
		
	}

}
