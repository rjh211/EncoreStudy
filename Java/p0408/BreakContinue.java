package p0408;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) {
		/*
		 * int num; String str = ""; Scanner sc = new Scanner(System.in);
		 * while(true){ System.out.println("����� ���� �Է��Ͻÿ�"); num = sc.nextInt();
		 * System.out.println("�Է°� : "+num); System.out.println("���߷��� Stop �Է�");
		 * str = sc.next(); if(str.startsWith("Stop")){ break; } }
		 */
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)
				continue;		//�� ���� ���๮�� �ǳʶٰ� Loop�� ����
			System.out.println(i + "\t");
		}
	}
}
