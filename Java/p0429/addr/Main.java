package p0429.addr;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new DaoImpl();
		//dao.insert(new Member(0,"dddd","4444","µø¿€±∏"));
		System.out.println(dao.selectByName("dddd"));
		System.out.println(dao.selectByNum(1));
		dao.update(new Member(2,"eee","eee","eee"));

		ArrayList<Member> list = dao.selectAll();
		System.out.println(list);
		for(Member m : list){
			System.out.println(m.toString());
		}
		dao.delete(2);
		list = dao.selectAll();
		System.out.println(list);
		for(Member m : list){
			System.out.println(m.toString());
		}
	}

}
