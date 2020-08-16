package p0409;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("������ : ");
		String operator = sc.next();
		System.out.println("ù��° ���� : ");
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
				res = "0���δ� ������ �����ϴ�.";
			}
			else
				resultNum = num1 / num2;
			break;
		default:
			res = "�ùٸ� �����ڸ� �Է��ϼ���";
			break;
		}
		if(res == "")	return Double.toString(resultNum);
		else return res;
	}

}
