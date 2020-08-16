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
				System.out.println("회원가입부터 진행하세요.");
				return;
			}
			System.out.println("id : ");
			String id = sc.next();	
			System.out.println("pw : ");
			String pwd = sc.next();
			
			if (!this.id.equals(id)) {
				System.out.println("등록되지 않은 ID입니다.");
			} else if (!this.pwd.equals(pwd)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else{
				System.out.println("로그인 성공");
				this.flag = true;
			}
		}
	}
	
	void RefreshInfrom(){
		System.out.println("변경할 정보를 선택하세요");
		System.out.println("1.비밀번호 2.이름 3.이메일");
		int num = sc.nextInt();
		if(this.flag){			
			switch(num){
			case 1:
				System.out.println("변경할 비밀번호를 입력하세요");
				String newPassword = sc.next();
				this.pwd = newPassword;
				System.out.println("변경 완료");
				break;
			case 2:
				System.out.println("변경할 이름을 입력하세요");
				String newName = sc.next();
				this.name = newName;
				System.out.println("변경 완료");
				break;
			case 3:
				System.out.println("변경할 메일을 입력하세요");
				String newEmail = sc.next();
				this.email = newEmail;
				System.out.println("변경 완료");
				break;
			default:
				System.out.println("올바른 숫자를 입력하세요.");
			}
		}else{
			System.out.println("로그인 먼저 하세요");
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
