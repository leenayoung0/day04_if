package day04_if;

import java.util.Scanner;

public class Quiz_team {
	public static void main(String[] args) {
		//1. ���� �� ���� �Է¹޾Ƽ�, 
		//�� ���� 50 �̻��� ������ 50�̸��� ������ �Ǵ��غ���.
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		if (num >= 50) System.out.println(num+"�� 50 �̻��� ��");
		else if (num < 50) System.out.println(num+"�� 50 �̸��� ��");
		
		//2. ���� �� ���� �Է¹޾Ƽ�, �� ���� 3�� ������� �Ǵ��غ�����
		
		int n;
		System.out.println("\n���� �Է�: ");
		n = sc.nextInt();
		if(n%3==0) System.out.println(n+"�� 3�� ���\n");
		else if(n%3!=0) System.out.println(n+"�� 3�� ����� �ƴ�\n");
		
		//3. �� �� kor, eng, math�� �Է¹޾� ����� 90�̻��̸� A,
		// 80�̻��̸� B, 70�� �̻��̸� C, 70�̸��̸� D�� ����Ͻÿ�.
		int kor, eng, math;
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		eng = sc.nextInt();
		
		System.out.print("���� ���� : ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum /3;
		
		System.out.println("���: "+avg);
		
		if(avg>=90)System.out.println("���: A");
		else if(avg>=80)System.out.println("���: B");
		else if(avg>=70)System.out.println("���: C");
		else System.out.println("���: D");
		
		//4. ���� ������ �Է¹޾� �ִ밪 �� �ּҰ� ���ϱ�
		
		System.out.print("\n�� ���� �Է�: ");
		int n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int max=0;
		if (n1>n2) max =n1;
		if (n2>n1) max= n2;
		if (n3>max) max=n3;
		
		int min=0;
		if (n1<n2) min=n1;
		if(n2<n1) min=n2;
		if(n3<min) min=n3;
		
		System.out.println("�ִ밪: "+max);
		System.out.println("�ּҰ�: "+min);
		
		//5. ���� �� ���� �Է� �޾Ƽ� ���ǽǹ�ȣ ����ϱ�
		// ������ 1.���� 2.���� 3.���� 4.���� 
		// code���� 1�̸� "101ȣ" 2�̸� "102ȣ", 3�̸� "203ȣ",
		// 4�̸� "202ȣ", ������ 5���ʹ� "�������� ����"
		int a;
		System.out.print("\n<�����ȣ>\n1.���� 2.���� 3.���� 4.����\n�����ȣ �Է� :");
		
		a = sc.nextInt();
		if(a==1)System.out.println("���ǽ�: 101ȣ");
		else if(a==2)System.out.println("���ǽ�: 102ȣ");
		else if(a==3)System.out.println("���ǽ�: 203ȣ");
		else if(a==4)System.out.println("���ǽ�: 202ȣ");
		else System.out.println("�������� ����");
		
		
		
		sc.close();	
		
	}

}
