package p0413;

import java.util.Scanner;

public class Menu {
	Service service = new Service();

	void run(Scanner sc){
		boolean flag = true;
		int menu;
		String str = "1.add 2.search 3.edit 4.del 5.printAll 6.stop";
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				service.AddMember(sc);
				break;
			case 2:
				service.PrintMember(sc);
				break;
			case 3:
				service.EditMember(sc);
				break;
			case 4:
				service.PrintAll();
				break;
			case 6:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
