package HomeWork.Mart;

import java.util.Scanner;

import HomeWork.Product.ProductVO;

public class MartService {
	MartVO mvo[];
	ProductVO  pvo = new ProductVO();
	Scanner sc = new Scanner(System.in);
	int count;
	public void Order(){
		System.out.print("주문할 제품 번호를 입력하세요 : ");
		int productNumber = sc.nextInt();
		System.out.print("주문할 제품 수량를 입력하세요 : ");
		int productAmount = sc.nextInt();
		mvo[count] = new MartVO(productNumber, productAmount);
	}
	public void PrintOrder(){
		for(int i = 0;i<mvo.length;i++){
			System.out.println((i+1) + "번째 주문번호 : "+mvo[i].getOrderNumber());
			System.out.println((i+1) + "번째 주문수량 : "+mvo[i].getOrderAmount());
			System.out.println((i+1) + "번째 제품가격 : "+mvo[i].getOrderPrice());
		}
	}
	public void IsPayed(){
		System.out.println("입력할  주문번호를 입력하세요.");
		int num = sc.nextInt();
		for(int i = 0;i<mvo.length;i++){
			if(num == mvo[i].getOrderNumber()){
				System.out.println(mvo[i].getIsPayed());
				return;
			} else {
				System.out.println("올바른 주문 번호를 입력하세요.");
			}
		}
	}
	public void Pay(){
		System.out.println("결제할 주문번호를 입력하시오. 입력이 끝났으면 -1을 입력하세요.");
		int select = sc.nextInt();
		int payMoney = 0;
		while(select >0 && mvo[select].getIsPayed() == false){
			payMoney += mvo[select].getOrderPrice();
		}
		System.out.println("총 결제 가격은 "+ select + "원 입니다.");
	}
	public void CancelOrder(){
		System.out.println("주문 취소할 주문번호를 입력하세요 : ");
		int number = sc.nextInt();
		if(mvo[number].getOrderNumber() == number){
			if(mvo[number].getIsPayed() == false){
				mvo[number].setOrderAmount(0);
				mvo[number].setOrderNumber(0);
				mvo[number].setOrderPrice(0);
			} else {
				System.out.println("이미 결제된 주문입니다.");
			}
		} else {
			System.out.println("올바른 주문번호를 입력하세요.");
		}
	}
}
