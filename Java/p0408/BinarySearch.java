package p0408;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 숫자를 입력하시오");
		int number = sc.nextInt();

		int first = 0, last = arr.length;
		
		while (last > first) {
			int mid = (first + last) / 2;
			if (arr[mid] > number) {
				last = mid-1;
			} else if (arr[mid] < number) {
				first = mid+1;
			} else {
				System.out.println("찾는 숫자는 " + (mid + 1) + "번째에 있습니다.");
				break;
			}
			if (last <= first) {
				System.out.println("찾으려는 숫자가 없습니다.");
			}
		}

	}

}
