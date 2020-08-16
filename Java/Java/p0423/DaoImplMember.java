package p0423;

import java.util.ArrayList;

public class DaoImplMember implements p0423.Dao{
	private ArrayList<Member> datas;
	public DaoImplMember(){
		datas = new ArrayList<Member>();
	}
	@Override
	public void Insert(Member m) {
		// TODO Auto-generated method stub
		if(!datas.contains(m)){		//�̸� �ߺ� ����
			datas.add(m);
		} else {
			System.out.println("�̸� �ߺ�");
		}
	}

	@Override
	public Member Select(String name) {
		// TODO Auto-generated method stub
		for(Member m : datas){
			if(m.getName().equals(name)){
				return m;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Member> SelectAll() {
		// TODO Auto-generated method stub
		return datas;
	}

	@Override
	public void Update(Member m) {
		// TODO Auto-generated method stub
		int index = datas.indexOf(m);
		if(index >= 0){			
			datas.set(index, m);
		} else{
			System.out.println("�߸��� �̸�");
		}
	}

	@Override
	public void Delete(String name) {
		// TODO Auto-generated method stub
		for(Member m : datas){
			if(m.getName().equals(name)){
				datas.remove(datas.indexOf(m));
				return;
			}
		}
	}

}
