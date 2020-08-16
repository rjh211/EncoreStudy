package HomeWork.Memo;

import java.util.Scanner;

public class MemoMenu {
	private MemoService service;
	MemoMenu(){
		service = new MemoServiceImpl();
	}
	public void Run(Scanner sc){
		boolean flag = true;
		String str = "1.�б� 2.���� 3.����";
		int menu;
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.FileLoad(sc);
				break;
			case 2:
				service.FileSave(sc);
				break;
			case 3:
				flag = false;
			}
		}
	}
}
