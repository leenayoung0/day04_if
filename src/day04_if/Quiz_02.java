package day04_if;

import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		//2번
		Scanner sc = new Scanner(System.in);
			//변수 선언을 반복문 안에서 하게 되면 변수의 변화 내용 저장이 안됨. 
			//반복으로 돌아가면서 다시 리셋된다
			//(내가 에러떠서 알려주신거)
		String home=null, corp=null;
		int n=0;
		
		while(true) {

			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			
			System.out.print("번호 선택: ");
			n = sc.nextInt();
			if(n==1) {		
				System.out.print("우리집 목적지 입력: ");
				home = sc.next();
				System.out.println("등록 성공");
			}
			if(n==2) {
				System.out.print("회사 목적지 입력: ");
				corp = sc.next();
				System.out.println("등록 성공");
			}
			if(n==3) {
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+corp);
				
			}
			sc.close();
		}
		
		
	}
	
}
