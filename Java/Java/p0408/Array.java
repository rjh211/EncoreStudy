package p0408;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr; // �迭�� ��ü�̴�.
		arr = new int[5];
		int[] otherArr = new int[5];
		otherArr[0] = 1;
		otherArr[1] = 2;
		otherArr[2] = 3;
		otherArr[3] = 4;
		otherArr[4] = 5;
		System.out.println(otherArr);

		// ��üŸ���� ������ ����������(reference variable)�� ���Ѵ�.(arr)
		// ���������� �������� �����ִ´�.

		int[] newArr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("num: ");
			newArr[i] = sc.nextInt();
		}
		int sum = 0;
		double avg = 0;
		int max = newArr[0], min = newArr[0];
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i] + "\t");
			sum += newArr[i];
			if (max < newArr[i])
				max = newArr[i];
			if (min > newArr[i])
				min = newArr[i];
		}
		avg = (double) sum / newArr.length;
		System.out.println("�迭�� ���� : " + sum);
		System.out.println("�迭�� ��� : " + avg);
		System.out.println("�迭�� �ּҰ� : " + min);
		System.out.println("�迭�� �ִ밪 : " + max);

		System.out.println("ã��������� �Է��Ͻÿ�");
		boolean isFound = false;
		int searchNum = sc.nextInt();
		for (int i = 0; i < newArr.length; i++) {
			if (searchNum == newArr[i]) {
				System.out.println(searchNum + "�� " + (i + 1) + "��° �迭�� �ֽ��ϴ�.");
				isFound = true;
				break;
			}
		}
		if (isFound == false)
			System.out.println("ã���ô� ���ڰ� �����ϴ�.");
		// �迭 ����� ���հ� ��� ���

	}

}
