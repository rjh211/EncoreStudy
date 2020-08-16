package p0410;

import java.util.Scanner;

public class MemberManagement {
	String id, pwd, name, email;
	boolean flag = false;
	Scanner sc = new Scanner(System.in);

	void Signup(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}

	void Login() {
		while(!this.flag){	
			if (this.id == null || this.pwd == null){			
				System.out.println("ȸ�����Ժ��� �����ϼ���.");
				return;
			}
			System.out.println("id : ");
			String id = sc.next();	
			System.out.println("pw : ");
			String pwd = sc.next();
			
			if (!this.id.equals(id)) {
				System.out.println("��ϵ��� ���� ID�Դϴ�.");
			} else if (!this.pwd.equals(pwd)) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			} else{
				System.out.println("�α��� ����");
				this.flag = true;
			}
		}
	}
	
	void RefreshInfrom(){
		System.out.println("������ ������ �����ϼ���");
		System.out.println("1.��й�ȣ 2.�̸� 3.�̸���");
		int num = sc.nextInt();
		if(this.flag){			
			switch(num){
			case 1:
				System.out.println("������ ��й�ȣ�� �Է��ϼ���");
				String newPassword = sc.next();
				this.pwd = newPassword;
				System.out.println("���� �Ϸ�");
				break;
			case 2:
				System.out.println("������ �̸��� �Է��ϼ���");
				String newName = sc.next();
				this.name = newName;
				System.out.println("���� �Ϸ�");
				break;
			case 3:
				System.out.println("������ ������ �Է��ϼ���");
				String newEmail = sc.next();
				this.email = newEmail;
				System.out.println("���� �Ϸ�");
				break;
			default:
				System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			}
		}else{
			System.out.println("�α��� ���� �ϼ���");
		}
	}
	void Logout(){
		this.flag = false;
	}

	String[] GetMemberInfo(){
		String[] Inform = new String[4];
		Inform[0] = this.id;
		Inform[1] = this.pwd;
		Inform[2] = this.name;
		Inform[3] = this.email;
		
		return Inform;
	}
	public static void main(String[] args){
		MemberManagement manage = new MemberManagement();
		manage.Signup("rjh211", "q1w2e3", "JH", "naver");
		manage.Login();
		String[]  Info = manage.GetMemberInfo();
		for(int i = 0 ; i<Info.length;i++) System.out.println(Info[i]);
	}
}
