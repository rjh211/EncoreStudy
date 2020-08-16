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
				System.out.println("두번째 숫자는 0이 아니어야 합니다.");
			} else {
				System.out.println(firstValue + "/" + secondValue + "=" + (double) (firstValue / secondValue));
			}
			break;
		default:
			System.out.println("다른 연산자를 입력하시오");
		}
	}

}
