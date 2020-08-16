package HomeWork.Mart;

import java.util.Scanner;

import HomeWork.Product.ProductVO;

public class MartService {
	MartVO mvo[];
	ProductVO  pvo = new ProductVO();
	Scanner sc = new Scanner(System.in);
	int count;
	public void Order(){
		System.out.print("�ֹ��� ��ǰ ��ȣ�� �Է��ϼ��� : ");
		int productNumber = sc.nextInt();
		System.out.print("�ֹ��� ��ǰ ������ �Է��ϼ��� : ");
		int productAmount = sc.nextInt();
		mvo[count] = new MartVO(productNumber, productAmount);
	}
	public void PrintOrder(){
		for(int i = 0;i<mvo.length;i++){
			System.out.println((i+1) + "��° �ֹ���ȣ : "+mvo[i].getOrderNumber());
			System.out.println((i+1) + "��° �ֹ����� : "+mvo[i].getOrderAmount());
			System.out.println((i+1) + "��° ��ǰ���� : "+mvo[i].getOrderPrice());
		}
	}
	public void IsPayed(){
		System.out.println("�Է���  �ֹ���ȣ�� �Է��ϼ���.");
		int num = sc.nextInt();
		for(int i = 0;i<mvo.length;i++){
			if(num == mvo[i].getOrderNumber()){
				System.out.println(mvo[i].getIsPayed());
				return;
			} else {
				System.out.println("�ùٸ� �ֹ� ��ȣ�� �Է��ϼ���.");
			}
		}
	}
	public void Pay(){
		System.out.println("������ �ֹ���ȣ�� �Է��Ͻÿ�. �Է��� �������� -1�� �Է��ϼ���.");
		int select = sc.nextInt();
		int payMoney = 0;
		while(select >0 && mvo[select].getIsPayed() == false){
			payMoney += mvo[select].getOrderPrice();
		}
		System.out.println("�� ���� ������ "+ select + "�� �Դϴ�.");
	}
	public void CancelOrder(){
		System.out.println("�ֹ� ����� �ֹ���ȣ�� �Է��ϼ��� : ");
		int number = sc.nextInt();
		if(mvo[number].getOrderNumber() == number){
			if(mvo[number].getIsPayed() == false){
				mvo[number].setOrderAmount(0);
				mvo[number].setOrderNumber(0);
				mvo[number].setOrderPrice(0);
			} else {
				System.out.println("�̹� ������ �ֹ��Դϴ�.");
			}
		} else {
			System.out.println("�ùٸ� �ֹ���ȣ�� �Է��ϼ���.");
		}
	}
}
