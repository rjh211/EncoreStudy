package HomeWork.Product;

import java.util.Scanner;

public class ProductService {
	ProductDAO dao = new ProductDAO();
	Scanner sc = new Scanner(System.in);
	
	public void InsertProduct(){
		System.out.print("제품 명을 입력하세요  : ");
		String name = sc.next();
		System.out.print("제품 수량을 입력하세요  : ");
		int amount = sc.nextInt();
		System.out.print("제품 가격을 입력하세요  : ");
		int price = sc.nextInt();
		
		dao.Insert(new ProductVO(amount,price,name));
	}
	
	public void InsertProduct(String name, int amount, int price){
		dao.Insert(new ProductVO(amount,price,name));
	}
	
	public void SearchProduct(String name){
		System.out.print("검색할 제품명을 입력하세요 : ");
		ProductVO vo = dao.Select(sc.next());
		vo.PrintAll();
	}
	
	public void SearchProduct(int number){
		System.out.print("검색할 제품 번호를 입력하세요 : ");
		ProductVO vo = dao.Select(number);
		vo.PrintAll();
	}
	
	public void UpdateProduct(int number){
		System.out.print("수정할 제품 번호를 입력하세요 : ");
		dao.Update(number);
	}
	
	public void DelectProduct(int number){
		System.out.print("삭제할 제품 번호를 입력하세요 : ");
		dao.Delete(number);
	}
	
	public void PrintProductList(){
		dao.PrintAll();
	}
	
	public void InputProduct(){
		System.out.print("입고할 제품 번호를 입력하세요");
		int number = sc.nextInt();
		System.out.print("입고할 수량을 입력하세요");
		int amount = sc.nextInt();
		
		ProductVO vo = dao.Select(number);
		if(vo != null){			
			vo.setProductAmount(vo.getProductAmount() + amount);
		}
	}
	
	public void OutputProduct(){
		System.out.print("출고할 제품 번호를 입력하세요");
		int number = sc.nextInt();
		System.out.print("출고할 수량을 입력하세요");
		int amount = sc.nextInt();
		
		ProductVO vo = dao.Select(number);
		if(vo != null){
			vo.setProductAmount(vo.getProductAmount() - amount);
		}			
	}
}
