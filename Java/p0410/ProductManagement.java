package p0410;
//DAO : 데이터베이스 처리 클래스
//Service : 비지니스 로직 구현 클래스, 기능 구현 클래스
public class ProductManagement {	//Data Transfer Object (DTO: 데이터 운반하는 객체) / VO(Value Object) 클래스
	int productNo, price, quantity;
	String productName;
	
	void setProductInfo(int no, String name, int price, int quantity){
		this.productNo = no;
		this.productName = name;
		this.price = price;
		this.quantity = quantity;
	}
	void printProductInfo(){
		System.out.println("제품 번호는 : \t"+this.productNo);
		System.out.println("제품 명은 : \t"+this.productName);
		System.out.println("제품 가격은 : \t"+this.price);
		System.out.println("제품 재고 수량은 : \t"+this.quantity);
	}
}
