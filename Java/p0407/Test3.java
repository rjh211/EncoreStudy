package p0407;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] argc) {
		int x = 3;
		if (x > 0) {
			System.out.println("x는 0보다 크다");
		} else if (x < 0) {
			System.out.println("x는 0보다 작다");
		} else {
			System.out.println("x는 0이다.");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("문제1");
		int num = sc.nextInt();
		if (num >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("문제2");
		int num2 = sc.nextInt();
		if (num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}
}
