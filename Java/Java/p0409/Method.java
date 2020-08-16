package p0409;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("연산자 : ");
		String operator = sc.next();
		System.out.println("첫번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.println(Method.Calculator(num1, operator, num2));
	}

	static String Calculator(int num1, String operator, int num2) {
		double resultNum = 0;
		String res = "";
		switch (operator) {
		case "+":
			resultNum = (num1 + num2);
			break;
		case "-":
			resultNum = num1 - num2;
			break;
		case "*":
			resultNum = num1 * num2;
			break;
		case "/":
			if (num2 == 0){
				res = "0으로는 나눌수 없습니다.";
			}
			else
				resultNum = num1 / num2;
			break;
		default:
			res = "올바른 연산자를 입력하세요";
			break;
		}
		if(res == "")	return Double.toString(resultNum);
		else return res;
	}

}
