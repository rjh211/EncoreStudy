package HomeWork2;

import java.util.Scanner;

public class Main {
	Service service;
	public Main(){
		service = new ServiceImplProd(new DaoImpl());			
	}
	public void run(Scanner sc){
		boolean flag = true;
		int menu = 0;
		String str = "1.공장 2.편의점 3.종료";
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			
			switch(menu){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
				default:
					
			}
		}
	}
	public static void main(String[] args){
		
	}
}
