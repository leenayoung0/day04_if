package day04_if;

import java.util.Scanner;

public class Ex06_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int num =0, num2, sum;
		//sum = num + num2;
		/*
		 int num; 
		 if(num==1) { 
		 	name = "test";
		 	 }
		 */
		// System.out.println(name); name에 오류가 남/ if문이 참이 아닐때 대입값이 없어서(쓰레기값)
		// 그래서 변수 초기화를 진행해줌
		// int 자료형은 보통 0으로 초기화 해줌./ 첫문자가 대문자인 자료형은 0으로 초기화 안됨 null로 초기화
		
		while(true) //반복문. 해당하는 조건이 참이면 종속문장이 계속해서 반복이 일어남
		{
			System.out.print("이름 입력 : ");
			name = input.next();
			System.out.println("당신의 이름은 "+name+" 이군요");
		
			input.close();
		}
		
		
	}

}
