package day04_if;

import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		//2��
		Scanner sc = new Scanner(System.in);
			//���� ������ �ݺ��� �ȿ��� �ϰ� �Ǹ� ������ ��ȭ ���� ������ �ȵ�. 
			//�ݺ����� ���ư��鼭 �ٽ� ���µȴ�
			//(���� �������� �˷��ֽŰ�)
		String home=null, corp=null;
		int n=0;
		
		while(true) {

			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			
			System.out.print("��ȣ ����: ");
			n = sc.nextInt();
			if(n==1) {		
				System.out.print("�츮�� ������ �Է�: ");
				home = sc.next();
				System.out.println("��� ����");
			}
			if(n==2) {
				System.out.print("ȸ�� ������ �Է�: ");
				corp = sc.next();
				System.out.println("��� ����");
			}
			if(n==3) {
				System.out.println("�츮�� : "+home);
				System.out.println("ȸ�� : "+corp);
				
			}
			sc.close();
		}
		
		
	}
	
}
