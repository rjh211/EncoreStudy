package HomeWork2;

import java.util.Scanner;

public interface Service {
	void adddProduct(Scanner sc);
	void PrintProduct(Scanner sc);	//제품 번호 검색하여 제품 출력
	void PrintAll();				//전체 검색한 목록 출력
	void getByName(Scanner sc);		//이름으로 검색하여 목록 출력
	void editPrice(Scanner sc);		//제품번호, 새가격 입력받아서 수정
	void in(Scanner sc);
	void out(Scanner sc, Order[] or);
	void delProduct(Scanner sc);	//제품번호 입력받아 삭제
	Product getByNum(int num);	//주문쪽에
	Product[] getAll();
}
