package p0423;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImplMember implements Service {
	private Dao dao;
	
	public ServiceImplMember(Dao dao){
		this.dao = dao;
	}
	@Override
	public void AddMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���");
		String tel = sc.next();
		System.out.println("�ּҸ� �Է��ϼ���.");
		String address = sc.next();
		 
		dao.Insert(new Member(name, tel, address));
	}

	@Override
	public void GetMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("�˻��� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Member m = dao.Select(name);
		if(m != null){
			System.out.println(m);
		} else {
			System.out.println("��ϵ��� ���� ��� �Դϴ�.");
		}
	}

	@Override
	public void GetAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> members = dao.SelectAll();
		for(Member m : members){
			System.out.println(m);
		}
	}

	@Override
	public void EditMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("������ �̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("������ �ڵ��� ��ȣ�� �Է��ϼ���");
		String tel = sc.next();
		System.out.println("������ �ּҸ� �Է��ϼ���.");
		String address = sc.next();
		
		dao.Update(new Member(name, tel, address));
	}

	@Override
	public void DelMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("������ ����� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Member m = dao.Select(name);
		if(m != null){
			dao.Delete(name);
		} else {
			System.out.println("��ϵ��� ���� ��� �Դϴ�.");
		}
	}

}
