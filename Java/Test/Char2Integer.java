package Test;

import java.util.Scanner;

public class Char2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = Operators(sc);
			System.out.println("결과값 : " + result);
	}
	static int AnotherMethod(Scanner sc){
		String str = sc.next();
		char op = 0;
		
		for(int i =0 ;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				op = ch;
			}
		}
		String[] s = str.split(Character.toString(op));
		
		return 0;
	}
	static int Operators(Scanner sc){
		char c = ' ';
		int num1 = 0, num2 = 0;
		boolean isOper = false;
		
		
		System.out.println("계산할 수식을 입력하세요. 숫자는 0이상의 정수");
		String org = sc.next();
		
		for(int i =0 ;i<org.length();i++){
			if(!Character.isDigit(org.charAt(i))){
				Character ch  = new Character(org.charAt(i));
				c = ch.charValue();
				isOper = true;
			} else if(Character.isDigit(org.charAt(i))){
				if(!isOper){
					byte b = (byte) org.charAt(i);
					num1 = num1*10 + b-(byte)'0';
				} else{
					byte b = (byte) org.charAt(i);
					num2 = num2*10 + b-(byte)'0';
				}
			}
		}
		switch(c){
		case '+':
			return num1+num2;
		case '-':
			return num1-num2; 
		case '*':
			return num1*num2;
		case '/':
			if(num2 != 0){
				return num1/num2;
			} else {
				System.out.println("0으로 나눌수 없습니다.");
				return 983212;
			}
			default:
				System.out.println("올바른 연산자를 입력하세요.");
		}
		return 983212;
	}
}
