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
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("핸드폰 번호를 입력하세요");
		String tel = sc.next();
		System.out.println("주소를 입력하세요.");
		String address = sc.next();
		 
		dao.Insert(new Member(name, tel, address));
	}

	@Override
	public void GetMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("검색할 이름을 입력하세요.");
		String name = sc.next();
		Member m = dao.Select(name);
		if(m != null){
			System.out.println(m);
		} else {
			System.out.println("등록되지 않은 사람 입니다.");
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
		System.out.println("수정할 이름을 입력하세요");
		String name = sc.next();
		System.out.println("수정할 핸드폰 번호를 입력하세요");
		String tel = sc.next();
		System.out.println("수정할 주소를 입력하세요.");
		String address = sc.next();
		
		dao.Update(new Member(name, tel, address));
	}

	@Override
	public void DelMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 사람의 이름을 입력하세요.");
		String name = sc.next();
		Member m = dao.Select(name);
		if(m != null){
			dao.Delete(name);
		} else {
			System.out.println("등록되지 않은 사람 입니다.");
		}
	}

}
