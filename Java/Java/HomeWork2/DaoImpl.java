package HomeWork2;

public class DaoImpl implements Dao {
	private Product[] datas;
	private int cnt;
	
	public DaoImpl(){
		datas = new Product[30];
	}
	@Override
	public int GetIdxByNum(int num) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<cnt;i++){
			if(num == datas[i].getProductNum()){
				return i;
			}
		}
		return -1;
	}

	@Override
	public void Delete(int num) {
		// TODO Auto-generated method stub
		int idx = GetIdxByNum(num);
		if(idx<0){
			System.out.println("없는제품");
		} else {
			for(int i =idx; i<cnt;i++){
				datas[i] = datas[i+1];
			}
			cnt--;
		}
	}

	@Override
	public void Insert(Product p) {
		// TODO Auto-generated method stub
		if(cnt >= datas.length){
			System.out.println("저장소가 찼다. 추가취소.");
			return;
		}
		datas[cnt] = p;
		cnt++;
	}

	@Override
	public Product SelectByNum(int num) {
		// TODO Auto-generated method stub
		int idx = GetIdxByNum(num);
		if(idx >=0){
			return datas[idx];
		}
		return null;
	}

	@Override
	public Product[] SelectByName(String name) {
		// TODO Auto-generated method stub
		int i =0 ,j;
		Product[] x = new Product[cnt];
		for(j =0 ;j<cnt;j++){
			if(name.equals(datas[j].getProductName())){
				x[i++]= datas[j];
			}
		}
		Product[] y = new Product[i];
		System.arraycopy(x, 0, y, 0, i);
		return y;
	}

	@Override
	public Product[] SelectAll() {
		// TODO Auto-generated method stub
		Product[] y = new Product[cnt];
		System.arraycopy(datas, 0, y, 0, cnt);
		return y;
	}

	@Override
	public void UpdatePrice(Product p) {
		// TODO Auto-generated method stub
		Product p2 = SelectByNum(p.getProductNum());
		if(p2 == null){
			System.out.println("없는 제품");
		} else{
			p2.setProductPrice(p.getProductPrice());
		}
	}

	@Override
	public boolean InOut(Product p) {
		// TODO Auto-generated method stub
		Product p2 = SelectByNum(p.getProductNum());
		if(p2 == null){
			System.out.println("없는 제품 : "+ p.getProductName()+" 취소");
		} else {
			switch(p.getProductName()){
			case "in":
				p2.setProductAmount(p2.getProductAmount()+p.getProductAmount());
				break;
			case "out":
				if(p2.getProductAmount()>=p.getProductAmount()){
					p2.setProductAmount(p2.getProductAmount()-p.getProductAmount());
				} else {
					System.out.println("수량 부족");
					return false;
				}
				break;
			}
		}
		return true;
	}
	public Product[] getDatas() {
		return datas;
	}
	public void setDatas(Product[] datas) {
		this.datas = datas;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
