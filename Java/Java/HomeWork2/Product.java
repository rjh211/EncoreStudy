package HomeWork2;

public class Product {
	private int productNum, productAmount, productPrice;
	private String productName;
	public Product(){
		
	}
	public Product(int amount, int price, String name){
			this.productNum++;
			this.productAmount = amount;
			this.productPrice = price;
			this.productName = name;
		}
	
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void PrintAll(){
		System.out.println("��ǰ ��ȣ : " + this.productNum);
		System.out.println("��ǰ ���� : " + this.productPrice);
		System.out.println("��ǰ ���� : " + this.productAmount);
		System.out.println("��ǰ �̸� : " + this.productName);
	}
}
