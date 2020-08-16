package p0423.address;

import java.util.Scanner;

public class Menu {
	private Service service;

	public Menu(Service service) {
		this.service = service;
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String str = "1.등록 2.검색 3.수정 4.삭제 5.목록 6.종료";
		int menu;
		service.FileLoad();
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.addMember(sc);
				break;
			case 2:
				service.getMember(sc);
				break;
			case 3:
				service.editMember(sc);
				break;
			case 4:
				service.delMember(sc);
				break;
			case 5:
				service.getAll();
				break;
			case 6:
				flag = false;
				service.FileSave();
			}
		}
	}
}
