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
		// System.out.println(name); name�� ������ ��/ if���� ���� �ƴҶ� ���԰��� ���(�����Ⱚ)
		// �׷��� ���� �ʱ�ȭ�� ��������
		// int �ڷ����� ���� 0���� �ʱ�ȭ ����./ ù���ڰ� �빮���� �ڷ����� 0���� �ʱ�ȭ �ȵ� null�� �ʱ�ȭ
		
		while(true) //�ݺ���. �ش��ϴ� ������ ���̸� ���ӹ����� ����ؼ� �ݺ��� �Ͼ
		{
			System.out.print("�̸� �Է� : ");
			name = input.next();
			System.out.println("����� �̸��� "+name+" �̱���");
		
			input.close();
		}
		
		
	}

}
