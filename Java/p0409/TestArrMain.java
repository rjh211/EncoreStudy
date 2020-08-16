package p0409;

class TestArr {
	int[] arr;

	void setArr(int[] array) {
		this.arr = array;
	}

	int[] getArr() {
		return this.arr;
	}

	void printArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	int GetElementSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	int[] GetMinMax() {
		int[] minMax = new int[2];
		minMax[0] = arr[0];
		minMax[1] = arr[arr.length - 1];
		return minMax;
	}

	void SortArr() {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
					if (j == 0) {
						arr[0] = temp;
					}
				} else {
					arr[j + 1] = temp;
					break;
				}
			}
		}
	}
}

public class TestArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 8, 6, 3, 4, 7 };
		TestArr testArr = new TestArr();
		testArr.setArr(arr);
		testArr.printArr();
		testArr.SortArr();
		testArr.printArr();
		int[] minMax = testArr.GetMinMax();
		int sumValue = testArr.GetElementSum();
		System.out.println("Min : " + minMax[0]);
		System.out.println("Max : " + minMax[1]);
		System.out.println("Sum : " + sumValue);

	}

}
