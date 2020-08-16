package p0413;

import java.util.Scanner;

public class Service {
	Dao dao;
	Service(){
		dao = new Dao();
	}
	void AddMember(Scanner sc){
		Member member = new Member();
		do{
			System.out.print("name : ");
			member.name = sc.next();
		}while(dao.GetIdx(member.name)>=0);	//�̸� �ߺ� üũ
		System.out.print("number : ");
		member.number = sc.nextInt();
		dao.Insert(member);
	}
	
	void PrintMember(Scanner sc){
		String selectName = sc.next();
		Member selectedMember = dao.Select(selectName);
		if(selectedMember != null){			
			System.out.println("�̸� : "+selectedMember.name);
			System.out.println("��ȣ : "+selectedMember.number);
		}
		else{
			System.out.println("���� �̸��Դϴ�.");
		}
	}
	
	void EditMember(Scanner sc){
		Member member = new Member();
		member.name = sc.next();
		member.number = sc.nextInt();
		dao.Update(member);
	}
	
	void DelMember(Scanner sc){
		String delName = sc.next();
		dao.Delete(delName);
	}
	
	void PrintAll(){
		dao.PrintAll();
	}
}
