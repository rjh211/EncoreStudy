package p0408;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] scoreArr = new int[5];
		
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.next();
		System.out.println("��ȣ�� �Է��Ͻÿ�");
		scoreArr[0] = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		scoreArr[1] = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		scoreArr[2] = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		scoreArr[3] = sc.nextInt();
		
		scoreArr[4] = scoreArr[1] + scoreArr[2] + scoreArr[3];
		float avg = scoreArr[4] / 3;

		System.out.println("�̸�  : " + name);
		System.out.println("��ȣ  : " + scoreArr[0]);
		System.out.println("����  : " + scoreArr[1]);
		System.out.println("����  : " + scoreArr[2]);
		System.out.println("����  : " + scoreArr[3]);
		System.out.println("����  : " + scoreArr[4]);
		System.out.println("���  : " + avg);
		
	}

}
