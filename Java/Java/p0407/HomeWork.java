package p0407;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		String str = "";

		for (int i = 0; i < number; i++) {
			str += "*";
			System.out.println(str);
		}
		System.out.println();
		for (int m = 0; m < number; m++) {
			System.out.println(str);
			str = str.substring(1);
		}

		for (int j = 0; j < number; j++) {
			str = "";
			for (int k = number - 2 - j; k > -1; k--) {
				str += " ";
			}
			for (int l = 0; l < j * 2 + 1; l++) {
				str += "*";
			}
			System.out.println(str);
		}

		for (int j = 0; j < number; j++) {
			str = "";
			for (int k = number - 2 - j; k > -1; k--) {
				str += " ";
			}
			for (int l = 0; l < j * 2 + 1; l++) {
				str += "*";
			}
			System.out.println(str);
		}
		for (int j = number - 1; j > 0; j--) {
			str = "";
			for (int k = 1; k < number - j + 1; k++) {
				str += " ";
			}
			for (int l = j * 2 - 1; l > 0; l--) {
				str += "*";
			}
			System.out.println(str);
		}
	}

}
