package p0407;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputId = sc.nextLine();
		String inputPassword = sc.nextLine();
		String id = "myid", password = "1234";
		if (inputId.equals(id) && inputPassword.equals(password)) {
			System.out.println("�α��� ����");
		} else if (inputId.equals(id)) {
			System.out.println("��й�ȣ ����");
		} else if (inputPassword.equals(password)) {
			System.out.println("�߸��� id");
		} else {
			System.out.println("�Ѵ� ����ġ");
		}

		// int, float
		// �� ���� �������� �� (����,����)
		// ���ڿ�, ��üŸ�� �񱳾ȵ�(���ڳ� ��ü�� �ּҰ��� ����)����or ��ü�� equals�� ��
	}

}
