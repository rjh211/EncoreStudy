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
				System.out.println("등록을 종료 합니다.");
				break;
			default:
				System.out.println("올바른 번호를 입력하세요.");
				break;
			}
			flag = Select(sc);
		} while (flag != 7);
	}

	public int Select(Scanner sc) {
		System.out.println("1.등록 2.제품 검색 3.정보 수정 4.삭제 5.제품목록출력 6.입출고 7. 종료");
		return sc.nextInt();
	}
}
