package HomeWork.Mart;
import HomeWork.Product.*;;

public class MartVO {
	private int orderNumber, orderAmount, orderPrice;
	private boolean isPayed;
	private ProductDAO pdao = new ProductDAO();
	private ProductVO[] pvo = pdao.getProudcts();
	
	public MartVO(int productNumber, int productAmount){
		for(int i=0 ;i<pvo.length;i++){
			if(pvo[i].getProductNum() == productNumber){
				this.orderNumber++;
				this.orderAmount = productAmount;
				this.orderPrice = pvo[i].getProductPrice() * this.orderAmount;
			} else {
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}
	}
	
/*	public MartVO(int productNumber, int productAmount) {
		for(int i=0 ;i<pvo.length;i++){
			if(pvo[i].getProductNum() == productNumber){
				this.orderNumber++;
				this.orderAmount = productAmount;
				this.orderPrice = pvo[i].getProductPrice() * this.orderAmount;
			} else {
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}
	}*/
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmout) {
		this.orderAmount = orderAmout;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public ProductVO[] getPvo() {
		return pvo;
	}
	public void setPvo(ProductVO[] pvo) {
		this.pvo = pvo;
	}
	public boolean getIsPayed() {
		return isPayed;
	}
	public void setISPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}
	
}
