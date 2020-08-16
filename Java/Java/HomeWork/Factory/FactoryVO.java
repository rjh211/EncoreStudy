package HomeWork.Factory;

public class FactoryVO {
	int productNum, productAmout, productPrice;
	String productName;
	public FactoryVO(){}
	public FactoryVO(int number, int amount, int price, String name){
		this.productNum = number;
		this.productAmout = amount;
		this.productPrice = price;
		this.productName = name;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public int getProductAmout() {
		return productAmout;
	}
	public void setProductAmout(int productAmout) {
		this.productAmout = productAmout;
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
	
	
}
