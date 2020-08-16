package HomeWork2;

import java.util.Scanner;

public class ServiceImplProd implements Service {
	Dao dao;
	ServiceImplProd(Dao dao){
		this.dao = dao;
	}
	@Override
	public void adddProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("추가할 제품 수량을 입력하세요.");
		int amount = sc.nextInt();
		System.out.println("추가할 제품 가격을 입력하세요.");
		int price = sc.nextInt();
		System.out.println("추가할 제품 이름을 입력하세요.");
		String name = sc.next();
		dao.Insert(new Product(amount, price, name));
	}

	@Override
	public void PrintProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("보고싶은 제품 번호를 입력하세요.");
		int number = sc.nextInt();
		dao.SelectByNum(number).PrintAll();;
	}

	@Override
	public void PrintAll() {
		// TODO Auto-generated method stub
		dao = new DaoImpl();
		Product[] tempDatas = ((DaoImpl) dao).getDatas();
		for(int i =0 ;i<((DaoImpl) dao).getCnt();i++){
			tempDatas[i].PrintAll();
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		dao = new DaoImpl();
		System.out.println("제품 이름을 입력하세요");
		String name = sc.next();
		Product[] tempData = dao.SelectByName(name);
		for(int i =0 ;i<tempData.length;i++){
			tempData[i].PrintAll();
		}
	}

	@Override
	public void editPrice(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("수정할 제품 번호를 입력하세요.");
		int number = sc.nextInt();
		Product data = dao.SelectByNum(number);
		System.out.println("수정할 가격을 입력하세요.");
		int newPrice = sc.nextInt();
		data.setProductPrice(newPrice);
	}

	@Override
	public void in(Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 제품번호를 입력하세요.");
		int number= sc.nextInt();
		dao.Delete(number);
	}

	@Override
	public void out(Scanner sc, Order[] or) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Product getByNum(int num) {
		// TODO Auto-generated method stub
		return dao.SelectByNum(num);
	}
	@Override
	public Product[] getAll() {
		// TODO Auto-generated method stub
		return dao.SelectAll();
	}

}
