package p0407;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hp = 30;
		int exp = 0;
		int level = 1; // exp 20 �̵Ǹ� ������
		// ��Ա� : hp 5����
		// ���ڱ� : hp 10����
		// ��� : hp 8����, exp 10����
		// ��ϱ� : hp 15����, exp 15����
		System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.� 5.���º��� 6.���� ����");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		while (hp > 0 && choice != 6) {
			switch (choice) {
			case 1: // ��Ա�
				hp += 5;
				System.out.println("hp 5����");
				break;
			case 2: // ���ڱ�
				hp += 10;
				System.out.println("hp 10����");
				break;
			case 3: // ���
				hp -= 8;
				exp += 10;
				System.out.println("hp 8����");
				System.out.println("exp 10����");
				if (exp >= 20) {
					exp -= 20;
					level += 1;
					System.out.println("level up");
				}
				if (hp <= 0) {
					System.out.println("ĳ���� ��� ��������");
				}
				break;
			case 4: // ��ϱ�
				hp -= 15;
				exp += 15;
				System.out.println("hp 15����");
				System.out.println("exp 15����");
				if (exp >= 20) {
					exp -= 20;
					level += 1;
					System.out.println("level up");
				}
				if (hp <= 0) {
					System.out.println("ĳ���� ��� ��������");
				}
				break;
			case 5: // ���� Ȯ���ϱ�
				System.out.println("hp : " + hp);
				System.out.println("exp : " + exp);
				System.out.println("level : " + level);
				break;
			default:
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}
			System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.� 5.���º��� 6.���� ����");
			choice = sc.nextInt();
			if (choice == 6) {
				System.out.println("������ �����մϴ�.");
			}
		}
	}

}
