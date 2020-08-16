package p0420;

class Product{
	String name;
	int price;
	int point;
}

class TV extends Product{
	public TV(){
		name = "tv";
		price = 1000;
		point = 100;
	}
}
class Audio extends Product{
	public Audio(){
		name = "audio";
		price = 2000;
		point = 200;
	}
}
class Computer extends Product{
	public Computer(){
		name = "computer";
		price = 3000;
		point = 300;
	}
}
class Buyer{
	int money = 10000;
	int point;
	public void buy(Product product){
		if(this.money >= product.price){
			this.money -= product.price;
			this.point += product.point;
			System.out.println(product.name + " 구매 완료");
		} else {
			System.out.println("잔액 부족");
		}
		printInfo();
	}
	
	public void printInfo(){
		System.out.println("money : " + this.money);
		System.out.println("point : " + this.point);
	}
}
public class Casting {
	public static void main(String[] args){
		Buyer buyer = new Buyer();//오버로딩 업캐스팅 둘다 사용가능
		Product[] productArr = {new TV(), new Computer(), new Audio()};
		for(int i =0 ;i<productArr.length;i++){
			buyer.buy(productArr[i]);
		}
		buyer.buy(new TV());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
	}
}
