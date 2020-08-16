package p0407;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;

		if (x == 1) {
			System.out.println("x는  1");
		} else if (x == 2) {
			System.out.println("x는  2");
		} else if (x == 3) {
			System.out.println("x는  3");
		} else {
			System.out.println("x는 이외의 값");
		}

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 100 || num < 0) {
			System.out.println("잘못된 점수 입니다.");
		} else if (num >= 90) {
			System.out.println("A 학점");
		} else if (num >= 80) {
			System.out.println("B 학점");
		} else if (num >= 70) {
			System.out.println("C 학점");
		} else if (num >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("F 학점");
		}
	}
}
