package p0406;

import java.io.IOException;
import java.util.Scanner;

//��� �ڵ�� Ŭ���� ���ο� �־����
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello  Java");
		int a = +10, b = 20, c = a+b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		String str = a > b ? "a�� b���� ũ��" : "b�� a���� ũ��";
		System.out.println(str);
		String str1 = a%2==0 ? "a�� ¦���̴�." : "b�� ¦���̴�.";
		System.out.println(str1);
		try {
//			int d = System.in.read();
//			System.out.println((char)d);
			Scanner sc = new Scanner(System.in);
			System.out.println("��ȣ : ");
			int num 
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
