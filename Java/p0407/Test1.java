package p0407;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ : ");
		int num = sc.nextInt();		//int�� �ϳ� �о��
		System.out.println("�̸� : ");
		String name = sc.next();		//�ܾ� �ϳ� �о��
		System.out.println("Ű : ");
		float height = sc.nextFloat();	//float �ϳ� �о��
		System.out.println("�ּ� : ");
		sc.nextLine();	//enter ������ �о��
		String address = sc.nextLine();	//��ĭ�� nextline()�ϳ� ���������� => �����Է� �� enter�� �����⶧���� buffer�� �ʿ���

		System.out.println("num:"+num);
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		System.out.println("address:"+address);
		sc.close();
	}
}
