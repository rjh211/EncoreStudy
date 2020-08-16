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
				System.out.println("주문을 종료 합니다.");
				break;
			default:
				System.out.println("올바른 번호를 입력하세요.");
				break;
			}
			flag = Select();
		} while (flag != 6);
	}

	public int Select() {
		System.out.println("1.주문 2.주문 목록 3.결제 확인 4.결제 금액 5.주문취소 6.종료");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
