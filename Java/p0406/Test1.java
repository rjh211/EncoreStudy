package p0406;

import java.io.IOException;
import java.util.Scanner;

//모든 코드는 클래스 내부에 있어야함
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello  Java");
		int a = +10, b = 20, c = a+b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		String str = a > b ? "a는 b보다 크다" : "b는 a보다 크다";
		System.out.println(str);
		String str1 = a%2==0 ? "a는 짝수이다." : "b는 짝수이다.";
		System.out.println(str1);
		try {
//			int d = System.in.read();
//			System.out.println((char)d);
			Scanner sc = new Scanner(System.in);
			System.out.println("번호 : ");
			int num 
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
