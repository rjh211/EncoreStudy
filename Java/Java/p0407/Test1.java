package p0407;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 : ");
		int num = sc.nextInt();		//int값 하나 읽어옴
		System.out.println("이름 : ");
		String name = sc.next();		//단어 하나 읽어옴
		System.out.println("키 : ");
		float height = sc.nextFloat();	//float 하나 읽어옴
		System.out.println("주소 : ");
		sc.nextLine();	//enter 전까지 읽어옴
		String address = sc.nextLine();	//윗칸에 nextline()하나 더쓰는이유 => 윗줄입력 후 enter를 누르기때문에 buffer가 필요함

		System.out.println("num:"+num);
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		System.out.println("address:"+address);
		sc.close();
	}
}
