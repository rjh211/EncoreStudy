package p0408;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� ���ڸ� �Է��Ͻÿ�");
		int number = sc.nextInt();

		int first = 0, last = arr.length;
		
		while (last > first) {
			int mid = (first + last) / 2;
			if (arr[mid] > number) {
				last = mid-1;
			} else if (arr[mid] < number) {
				first = mid+1;
			} else {
				System.out.println("ã�� ���ڴ� " + (mid + 1) + "��°�� �ֽ��ϴ�.");
				break;
			}
			if (last <= first) {
				System.out.println("ã������ ���ڰ� �����ϴ�.");
			}
		}

	}

}
