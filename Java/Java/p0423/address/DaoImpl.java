package p0423.address;

import java.util.ArrayList;

public class DaoImpl implements Dao {

	private ArrayList<Member> datas;

	public DaoImpl() {
		datas = new ArrayList<Member>();
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		if (datas.contains(m)) {// contains(m): m이 리스트에 있는지 확인. 각방의 객체가 m이랑 같은지
								// 비교(equals()).
			System.out.println("중복된 이름. 등록 취소");
		} else {
			datas.add(m);
		}
	}

	@Override
	public Member select(String name) {
		// TODO Auto-generated method stub

//		Member m = new Member(name, "", "");
//		int idx = datas.indexOf(m);
//		if (idx >= 0) {
//			return datas.get(idx);
//		}

		for (Member m : datas) {
			if (name.equals(m.getName())) {
				return m;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		return datas;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		int idx = datas.indexOf(m);
		if (idx < 0) {
			System.out.println("등록되지 않은 이름. 수정취소");
		} else {
			datas.set(idx, m);
		}
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		if (!datas.remove(new Member(name, "", ""))) {
			System.out.println("등록되지 않은 이름. 삭제취소");
		}
	}

}
