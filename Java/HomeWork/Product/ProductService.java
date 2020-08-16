package HomeWork.Product;

import java.util.Scanner;

public class ProductService {
	ProductDAO dao = new ProductDAO();
	Scanner sc = new Scanner(System.in);
	
	public void InsertProduct(){
		System.out.print("��ǰ ���� �Է��ϼ���  : ");
		String name = sc.next();
		System.out.print("��ǰ ������ �Է��ϼ���  : ");
		int amount = sc.nextInt();
		System.out.print("��ǰ ������ �Է��ϼ���  : ");
		int price = sc.nextInt();
		
		dao.Insert(new ProductVO(amount,price,name));
	}
	
	public void InsertProduct(String name, int amount, int price){
		dao.Insert(new ProductVO(amount,price,name));
	}
	
	public void SearchProduct(String name){
		System.out.print("�˻��� ��ǰ���� �Է��ϼ��� : ");
		ProductVO vo = dao.Select(sc.next());
		vo.PrintAll();
	}
	
	public void SearchProduct(int number){
		System.out.print("�˻��� ��ǰ ��ȣ�� �Է��ϼ��� : ");
		ProductVO vo = dao.Select(number);
		vo.PrintAll();
	}
	
	public void UpdateProduct(int number){
		System.out.print("������ ��ǰ ��ȣ�� �Է��ϼ��� : ");
		dao.Update(number);
	}
	
	public void DelectProduct(int number){
		System.out.print("������ ��ǰ ��ȣ�� �Է��ϼ��� : ");
		dao.Delete(number);
	}
	
	public void PrintProductList(){
		dao.PrintAll();
	}
	
	public void InputProduct(){
		System.out.print("�԰��� ��ǰ ��ȣ�� �Է��ϼ���");
		int number = sc.nextInt();
		System.out.print("�԰��� ������ �Է��ϼ���");
		int amount = sc.nextInt();
		
		ProductVO vo = dao.Select(number);
		if(vo != null){			
			vo.setProductAmount(vo.getProductAmount() + amount);
		}
	}
	
	public void OutputProduct(){
		System.out.print("����� ��ǰ ��ȣ�� �Է��ϼ���");
		int number = sc.nextInt();
		System.out.print("����� ������ �Է��ϼ���");
		int amount = sc.nextInt();
		
		ProductVO vo = dao.Select(number);
		if(vo != null){
			vo.setProductAmount(vo.getProductAmount() - amount);
		}			
	}
}
