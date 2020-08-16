package p0409;

public class DoubleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 집합 데이터를 쉽게 사용하기 위해 사용, 크기, 타비 고정( 선언 및 생성할 때 정한다. )
		int[] arr = new int[3];
		int[][] arr2 = new int[2][3];
		/*
		 * arr2[0][0] = 1; arr2[0][1] = 2; arr2[0][2] = 3; arr2[1][0] = 4;
		 * arr2[1][1] = 5; arr2[1][2] = 6;
		 */
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = i + j + 1;
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}

		int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2차원 배열의 초기화
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
