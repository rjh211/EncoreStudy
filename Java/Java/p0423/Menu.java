package p0423;

import java.util.Scanner;

public class Menu {
	private Service service;
	Menu(Service service){
		this.service = service;
	}
	public void Run(Scanner sc){
		String str = "1.��� 2.�˻� 3.���� 4.���� 5.��� 6.����";
		int menu;
		boolean flag = false;
		
		while(!flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				service.AddMember(sc);
				break;
			case 2:
				service.GetMember(sc);
				break;
			case 3: 
				service.EditMember(sc);
				break;
			case 4:
				service.DelMember(sc);
				break;
			case 5:
				service.GetAll();
				break;
			case 6:
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�߸��� ��ȣ�Է�");
			}
		}
			
	}
}
