package HomeWork.Memo;

import java.util.ArrayList;

public class MemoDaoImpl implements MemoDao {
	private ArrayList<Memo> memoList;
	public MemoDaoImpl(){
		this.memoList = new ArrayList<Memo>();
	}
	@Override
	public void insert(Memo m) {
		// TODO Auto-generated method stub
		if(memoList.contains(m)){
			System.out.println("�ߺ��� �޸��Դϴ�.");
		} else{
			memoList.add(m);
		}
	}

	@Override
	public Memo select(String title) {
		// TODO Auto-generated method stub
		for(Memo m : memoList){
			if(m.equals(title)){
				return m;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Memo> selectAll() {
		// TODO Auto-generated method stub
		return memoList;
	}

	@Override
	public void update(Memo m) {
		// TODO Auto-generated method stub
		int idx = memoList.indexOf(m);
		if(idx > 0){
			memoList.set(idx, m);
		} else{
			System.out.println("��ϵ��� ���� Title");
		}
	}

	@Override
	public void delete(String title) {
		// TODO Auto-generated method stub
		if(!memoList.remove(new Memo(title, ""))){
			System.out.println("���� Title �Դϴ�..");
		}
	}

}
