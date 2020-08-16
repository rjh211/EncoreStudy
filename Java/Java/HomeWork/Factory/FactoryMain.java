package HomeWork.Factory;

import java.util.Scanner;

public class FactoryMain {
	FactoryService fService = new FactoryService();
	public void Factory(Scanner sc){
		
		int flag = Select(sc);
		do {
			switch (flag) {
			case 1:
				fService.Production();
				break;
			case 2:
				fService.PrintOrder();
				break;
			case 3:
				fService.IsPayed();
				break;
			case 4:
				fService.Pay();
				break;
			case 5:
				fService.CancelOrder();
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("����� ���� �մϴ�.");
				break;
			default:
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���.");
				break;
			}
			flag = Select(sc);
		} while (flag != 7);
	}

	public int Select(Scanner sc) {
		System.out.println("1.��� 2.��ǰ �˻� 3.���� ���� 4.���� 5.��ǰ������ 6.����� 7. ����");
		return sc.nextInt();
	}
}
