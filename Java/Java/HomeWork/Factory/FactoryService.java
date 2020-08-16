package HomeWork.Factory;
import java.util.Scanner;

import HomeWork.Product.*;
public class FactoryService {
	ProductService pService = new ProductService();
	Scanner sc = new Scanner(System.in);
	public void Production(){
		FactoryVO vo = new FactoryVO();
		System.out.print("생산할 제품의 이름을 입력하세요  : ");
		vo.setProductName(sc.next());
		System.out.print("생산할 제품의 수량을 입력하세요  : ");
		vo.setProductAmout(sc.nextInt());
		System.out.print("생산할 제품의 가격을 입력하세요  : ");
		vo.setProductPrice(sc.nextInt());
		
		pService.InsertProduct(vo.getProductName(), vo.getProductAmout(), vo.getProductPrice());
	}
}
