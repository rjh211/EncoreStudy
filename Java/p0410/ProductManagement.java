package p0410;
//DAO : �����ͺ��̽� ó�� Ŭ����
//Service : �����Ͻ� ���� ���� Ŭ����, ��� ���� Ŭ����
public class ProductManagement {	//Data Transfer Object (DTO: ������ ����ϴ� ��ü) / VO(Value Object) Ŭ����
	int productNo, price, quantity;
	String productName;
	
	void setProductInfo(int no, String name, int price, int quantity){
		this.productNo = no;
		this.productName = name;
		this.price = price;
		this.quantity = quantity;
	}
	void printProductInfo(){
		System.out.println("��ǰ ��ȣ�� : \t"+this.productNo);
		System.out.println("��ǰ ���� : \t"+this.productName);
		System.out.println("��ǰ ������ : \t"+this.price);
		System.out.println("��ǰ ��� ������ : \t"+this.quantity);
	}
}
