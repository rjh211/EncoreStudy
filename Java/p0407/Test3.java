package p0407;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] argc) {
		int x = 3;
		if (x > 0) {
			System.out.println("x�� 0���� ũ��");
		} else if (x < 0) {
			System.out.println("x�� 0���� �۴�");
		} else {
			System.out.println("x�� 0�̴�.");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("����1");
		int num = sc.nextInt();
		if (num >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}

		System.out.println("����2");
		int num2 = sc.nextInt();
		if (num2 % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

	}
}
