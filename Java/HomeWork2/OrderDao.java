package HomeWork2;

public interface OrderDao {
	void insert(Order o);		//주문등록
	int GetIdxByNum(int num);		//주문번호로 검색하여 배열위치 반환
	Order Select(int num);		//주문번호로 검색하여 주문객체 반환
	Order[] SelectAll();		//ㅈ전체 검색하여 반환
	void del(int num);			//주문번호로 주문삭제(취소)
	Order[] SelectByPayFalse();//결제 대상 목록
	Order[] SelectByOut(); // 출고대상 목록
	void UpdateFlag(int num, int type, boolean flag);//
}
