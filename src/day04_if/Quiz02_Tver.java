package day04_if;

import java.util.Scanner;

public class Quiz02_Tver {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String home=null,office=null;
		int num;
		while(true){
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			num = input.nextInt();
			switch(num){
			case 1: System.out.print("�츮�� ������ �Է�: ");
			home = input.next();	System.out.println("��� ����");	break;
			case 2:System.out.print("ȸ�� ������ �Է� : ");office = input.next();
			System.out.println("��� ����");	break;
			case 3:System.out.println("�츮�� : "+home);
			System.out.println("ȸ�� : "+office);
			}
			
			input.close();
		}
		
	}

}
