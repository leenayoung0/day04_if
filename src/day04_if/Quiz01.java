package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1번
		
		while(true) {
			int num;
			System.out.print("날짜 숫자만 입력 (예 1일 -> 1) : ");
			num = sc.nextInt();
			if(num%7==1) {
				System.out.println("월요일");
			}
			if(num%7==2) {
				System.out.println("화요일");
			}
			if(num%7==3) {
				System.out.println("수요일");
			}
			if(num%7==4) {
				System.out.println("목요일");
			}
			if(num%7==5) {
				System.out.println("금요일");
			}
			if(num%7==6) {
				System.out.println("토요일");
			}
			if(num%7==7) {
				System.out.println("일요일");
			}
			sc.close();
		}
		
	}
	

}
