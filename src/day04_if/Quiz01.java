package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1��
		
		while(true) {
			int num;
			System.out.print("��¥ ���ڸ� �Է� (�� 1�� -> 1) : ");
			num = sc.nextInt();
			if(num%7==1) {
				System.out.println("������");
			}
			if(num%7==2) {
				System.out.println("ȭ����");
			}
			if(num%7==3) {
				System.out.println("������");
			}
			if(num%7==4) {
				System.out.println("�����");
			}
			if(num%7==5) {
				System.out.println("�ݿ���");
			}
			if(num%7==6) {
				System.out.println("�����");
			}
			if(num%7==7) {
				System.out.println("�Ͽ���");
			}
			sc.close();
		}
		
	}
	

}
