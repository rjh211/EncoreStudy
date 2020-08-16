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
		if (datas.contains(m)) {// contains(m): m�� ����Ʈ�� �ִ��� Ȯ��. ������ ��ü�� m�̶� ������
								// ��(equals()).
			System.out.println("�ߺ��� �̸�. ��� ���");
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
			System.out.println("��ϵ��� ���� �̸�. �������");
		} else {
			datas.set(idx, m);
		}
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		if (!datas.remove(new Member(name, "", ""))) {
			System.out.println("��ϵ��� ���� �̸�. �������");
		}
	}

}
