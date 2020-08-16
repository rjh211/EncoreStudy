package p0408;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) {
		/*
		 * int num; String str = ""; Scanner sc = new Scanner(System.in);
		 * while(true){ System.out.println("출력할 수를 입력하시오"); num = sc.nextInt();
		 * System.out.println("입력값 : "+num); System.out.println("멉추려면 Stop 입력");
		 * str = sc.next(); if(str.startsWith("Stop")){ break; } }
		 */
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)
				continue;		//이 뒤의 실행문을 건너뛰고 Loop로 점프
			System.out.println(i + "\t");
		}
	}
}
