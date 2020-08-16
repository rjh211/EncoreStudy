package HomeWork2;

public class ServiceImplOrder implements OrderDao {
	int cnt;
	Order[] datas;
	@Override
	public void insert(Order o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int GetIdxByNum(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order Select(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order[] SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void del(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order[] SelectByPayFalse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order[] SelectByOut() {
		// TODO Auto-generated method stub
		Order[] x = new Order[cnt];
		int i,j = 0;
		for(i =0 ;i<cnt;i++){
			if(datas[i].isPay_flag() && !datas[i].isOut_flag()){
				x[j++]=datas[i];
			}
		}
		Order[] y = new Order[j];
		System.arraycopy(x, 0, y, 0, j);
		return y;
	}

	@Override
	public void UpdateFlag(int num, int type, boolean flag) {
		// TODO Auto-generated method stub
		
	}

}
