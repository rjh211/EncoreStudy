package p0407;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstValue = sc.nextInt();
		int secondValue = sc.nextInt();

		String operator = sc.next();
		switch (operator) {
		case "+":
			System.out.println(firstValue + "+" + secondValue + "=" + (firstValue + secondValue));
			break;
		case "-":
			System.out.println(firstValue + "-" + secondValue + "=" + (firstValue - secondValue));
			break;
		case "*":
			System.out.println(firstValue + "*" + secondValue + "=" + (firstValue * secondValue));
			break;
		case "/":
			if (secondValue == 0) {
				System.out.println("�ι�° ���ڴ� 0�� �ƴϾ�� �մϴ�.");
			} else {
				System.out.println(firstValue + "/" + secondValue + "=" + (double) (firstValue / secondValue));
			}
			break;
		default:
			System.out.println("�ٸ� �����ڸ� �Է��Ͻÿ�");
		}
	}

}
