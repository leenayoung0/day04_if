package day04_if;

import java.util.Scanner;

public class Quiz01_Tver {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("��¥ �Է� : ");
			num = input.nextInt();
			switch(num%7){
			case 1:System.out.println(num+":������");break;
			case 2:System.out.println(num+"ȭ����");break;
			case 3:System.out.println(num+":������");break;
			case 4:System.out.println(num+"�����");break;
			case 5:System.out.println(num+":�ݿ���");break;
			case 6:System.out.println(num+"�����");break;
			case 0:System.out.println(num+":�Ͽ���");break;
			}
			input.close();
		}
	}

}
