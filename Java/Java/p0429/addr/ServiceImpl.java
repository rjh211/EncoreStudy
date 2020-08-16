package p0429.addr;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl implements Service{
	private Dao dao;
	
	public ServiceImpl(){
		dao = new DaoImpl();
	}
	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.println("name : ");
		m.setName(sc.next());
		System.out.println("tel : ");
		m.setTel(sc.next());
		System.out.println("address : ");
		m.setAddress(sc.next());
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("search name");
		String name = sc.next();
		ArrayList<Member> list = dao.selectByName(name);
		if(list.isEmpty()){System.out.println("not found");}
		else{
			for(Member m : list){
				System.out.println(m);
			}
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

}
