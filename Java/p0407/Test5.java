package p0407;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputId = sc.nextLine();
		String inputPassword = sc.nextLine();
		String id = "myid", password = "1234";
		if (inputId.equals(id) && inputPassword.equals(password)) {
			System.out.println("로그인 성공");
		} else if (inputId.equals(id)) {
			System.out.println("비밀번호 오류");
		} else if (inputPassword.equals(password)) {
			System.out.println("잘못된 id");
		} else {
			System.out.println("둘다 불일치");
		}

		// int, float
		// 두 값이 동일함을 비교 (숫자,문자)
		// 문자열, 객체타입 비교안됨(문자나 객체는 주소값을 비교함)문자or 객체는 equals로 비교
	}

}
