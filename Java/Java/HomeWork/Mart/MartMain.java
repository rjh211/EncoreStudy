package HomeWork.Mart;

import java.util.Scanner;

public class MartMain {
	MartService mService = new MartService();

	public void Mart() {
		int flag = Select();
		do {
			switch (flag) {
			case 1:
				mService.Order();
				break;
			case 2:
				mService.PrintOrder();
				break;
			case 3:
				mService.IsPayed();
				break;
			case 4:
				mService.Pay();
				break;
			case 5:
				mService.CancelOrder();
				break;
			case 6:
				System.out.println("�ֹ��� ���� �մϴ�.");
				break;
			default:
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���.");
				break;
			}
			flag = Select();
		} while (flag != 6);
	}

	public int Select() {
		System.out.println("1.�ֹ� 2.�ֹ� ��� 3.���� Ȯ�� 4.���� �ݾ� 5.�ֹ���� 6.����");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
