package HomeWork.Factory;
import java.util.Scanner;

import HomeWork.Product.*;
public class FactoryService {
	ProductService pService = new ProductService();
	Scanner sc = new Scanner(System.in);
	public void Production(){
		FactoryVO vo = new FactoryVO();
		System.out.print("������ ��ǰ�� �̸��� �Է��ϼ���  : ");
		vo.setProductName(sc.next());
		System.out.print("������ ��ǰ�� ������ �Է��ϼ���  : ");
		vo.setProductAmout(sc.nextInt());
		System.out.print("������ ��ǰ�� ������ �Է��ϼ���  : ");
		vo.setProductPrice(sc.nextInt());
		
		pService.InsertProduct(vo.getProductName(), vo.getProductAmout(), vo.getProductPrice());
	}
}
