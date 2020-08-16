package p0408;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] scoreArr = new int[5];
		
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		System.out.println("번호를 입력하시오");
		scoreArr[0] = sc.nextInt();
		System.out.println("국어 점수를 입력하시오");
		scoreArr[1] = sc.nextInt();
		System.out.println("영어 점수를 입력하시오");
		scoreArr[2] = sc.nextInt();
		System.out.println("수학 점수를 입력하시오");
		scoreArr[3] = sc.nextInt();
		
		scoreArr[4] = scoreArr[1] + scoreArr[2] + scoreArr[3];
		float avg = scoreArr[4] / 3;

		System.out.println("이름  : " + name);
		System.out.println("번호  : " + scoreArr[0]);
		System.out.println("국어  : " + scoreArr[1]);
		System.out.println("영어  : " + scoreArr[2]);
		System.out.println("수학  : " + scoreArr[3]);
		System.out.println("총점  : " + scoreArr[4]);
		System.out.println("평균  : " + avg);
		
	}

}
