package day04_if;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력");
		select = input.nextInt();
		switch(select) {		
		case 1:
			System.out.println("1.입력값 : "+select); 
			//break;
		case 2:System.out.println("2.입력값 : "+select); break;
		case 3:System.out.println("3.입력값 : "+select); break;
		default:System.out.println("4. 1,2,3을 제외한 다른 값 입력");
		}
		
		/* 이것과 같음
		  if(select==1) {
		  
		  }
		  
		  default는 else와 같다. 생략 가능하다
		  break : 문장이 성립되면 다음 문장 다 건너뛰고 switch 구문 밖으로 빠져나감
		 */
		
		//내 질문때문에 하나 더 추가해서 알려주심
		System.out.println("수 입력");
		select = input.nextInt();
		switch(select%2) {
		case 0:System.out.println("짝수입력");
		case 1:
			System.out.println("1.입력값 : "+select); 
			//break;
		case 2:System.out.println("2.입력값 : "+select); break;
		case 3:System.out.println("3.입력값 : "+select); break;
		default:System.out.println("4. 1,2,3을 제외한 다른 값 입력");
		}
		
		input.close();
	}

}
