package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=1;
		System.out.print("��¥ ���ڸ� �Է� (�� 1�� -> 1) : ");
		num = sc.nextInt();
		if(num>=1 && num <=31) {
			System.out.println();
		}
	}

}
