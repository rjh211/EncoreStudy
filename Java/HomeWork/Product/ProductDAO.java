package HomeWork.Product;

import java.util.Scanner;

public class ProductDAO {
	ProductVO[] products = new ProductVO[10];
	Scanner sc = new Scanner(System.in);
	
	int count;
	
	public ProductVO[] getProudcts(){
		return products;
	}
	public void Insert(ProductVO p){
		products[count]= p;
		++count;
	}
	public int getIndex(int number){
		for(int i = 0;i <products.length;i++){
			if(products[i].getProductNum() == number){
				return i;
			}
		}
		return -1;
	}
	public void Update(int number){
		int index = getIndex(number);
		if (index > 0) {
			System.out.print("������ ������ �Է��ϼ��� : ");
			products[index].setProductPrice(sc.nextInt());
		} else{
			System.out.println("�ùٸ� ��ǰ��ȣ�� �Է��ϼ���.");
		}
	}
	public ProductVO Select(int number){
		int index = getIndex(number);
		if (index > 0) {
			return products[index];
		}else{
			System.out.println("�ùٸ� ��ǰ��ȣ�� �Է��ϼ���.");
		}
		return null;
	}
	public ProductVO Select(String name){
		for(int i = 0;i<products.length; i++){
			if(products[i].getProductName().equals(name)){
				return products[i];
			}
		}
		System.out.println("�ùٸ� ��ǰ�� �Է��ϼ���.");
		return null;
	}
	public void Delete(int number){
		int index = getIndex(number);
		if(index >0){
			for(int i = index ; i<products.length;i++){
				products[i] = products[i+1];
			}
			count--;
		}else{
			System.out.println("�ùٸ� ��ǰ��ȣ�� �Է��ϼ���.");
		}
	}
	
	public void PrintAll(){
		for(int i =0 ;i<products.length;i++){
			products[i].PrintAll();
		}
	}
}
