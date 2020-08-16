package HomeWork.Memo;

import java.util.Scanner;

public class Menu {
	private Service service;
	public Menu(){
		service = new ServiceImpl();
	}
	public void run(Scanner sc){
		String s = "1.�б� 2.���� 3.����";
		boolean flag = true;
		int menu;
		service.mkDir();
		while(flag){
			System.out.println(s);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				service.Read(sc);
				break;
			case 2:
				service.Write(sc);
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}
}
