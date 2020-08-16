package p0407;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result += i;
		}
		System.out.println(result);

		// Scanner sc = new Scanner(System.in);
		// int value = sc.nextInt();
		// for (int i = 1; i <= value; i++) {
		// if (value % i == 0) {
		// System.out.println(i);
		// }
		// }
		// for (int i = 1; i <= 9; i++) {
		// System.out.println(4 + " x " + i + " = " + i * 4);
		// }
		//
		// String str = "";
		// for (int i = 0; i < 4; i++) {
		// str += "*";
		// System.out.println(str);
		// }

		/*
		 * for (int i = 2; i < 10; i++) { for (int j = 1; j < 10; j++) {
		 * System.out.println(i + " x " + j + " = " + i * j); } } for (int i =
		 * 1; i < 10; i++) { for (int j = 2; j < 10; j++) { System.out.print(j +
		 * " x " + i + " = " + i * j + "\t"); } System.out.println(); }
		 * 
		 * boolean isPrime = true; for (int i = 1; i <= 100; i++) { isPrime =
		 * true; for (int j = 2; j < i; j++) { if (i % j == 0) { isPrime =
		 * false; } } if (isPrime == true) { System.out.println(i); } }
		 */

		int i = 1;
		Scanner sc = new Scanner(System.in);
		do {
			i = sc.nextInt();
			if (i > 100 || i < 0) {
				System.out.println("다시 입력하시오");
			} else if (i >= 90) {
				System.out.println(("A학점"));
			} else if (i >= 80) {
				System.out.println("B학점");
			} else if (i >= 70) {
				System.out.println("C학점");
			} else if (i >= 60) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점");
			}

		} while (i != 0);

	}

}
