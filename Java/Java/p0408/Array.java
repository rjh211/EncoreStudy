package p0408;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr; // 배열도 객체이다.
		arr = new int[5];
		int[] otherArr = new int[5];
		otherArr[0] = 1;
		otherArr[1] = 2;
		otherArr[2] = 3;
		otherArr[3] = 4;
		otherArr[4] = 5;
		System.out.println(otherArr);

		// 객체타입의 변수는 참조변수라(reference variable)고 말한다.(arr)
		// 참조변수는 참조값을 갖고있는다.

		int[] newArr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("num: ");
			newArr[i] = sc.nextInt();
		}
		int sum = 0;
		double avg = 0;
		int max = newArr[0], min = newArr[0];
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i] + "\t");
			sum += newArr[i];
			if (max < newArr[i])
				max = newArr[i];
			if (min > newArr[i])
				min = newArr[i];
		}
		avg = (double) sum / newArr.length;
		System.out.println("배열의 총합 : " + sum);
		System.out.println("배열의 평균 : " + avg);
		System.out.println("배열의 최소값 : " + min);
		System.out.println("배열의 최대값 : " + max);

		System.out.println("찾고싶은값을 입력하시오");
		boolean isFound = false;
		int searchNum = sc.nextInt();
		for (int i = 0; i < newArr.length; i++) {
			if (searchNum == newArr[i]) {
				System.out.println(searchNum + "는 " + (i + 1) + "번째 배열에 있습니다.");
				isFound = true;
				break;
			}
		}
		if (isFound == false)
			System.out.println("찾으시는 문자가 없습니다.");
		// 배열 요소의 총합과 평균 출력

	}

}
