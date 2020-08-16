package p0410;

class Sort {

	void InsertSort(int[] arr) {
		System.out.println("InsertSort 진행");
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					arr[j + 1] = temp;
					break;
				}
				if (j == 0) {
					arr[0] = temp;
				}
			}
		}
	}

	void SelectSort(int[] arr) {
		printArr(arr);
		System.out.println("SelectSort 진행");
		for (int i = 0; i < arr.length; i++) {
			int min = 999;
			int index = -1;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		printArr(arr);
	}

	void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

class Search {
	void BinarySearch(int[] arr, int findNum) {
		int first = 0;
		int last = arr.length;
		int packet;

		while (last >= first) {
			packet = (first + last) / 2;

			if (arr[packet] > findNum) {
				last = packet - 1;
			} else if (arr[packet] < findNum) {
				first = packet + 1;
			} else {
				System.out.println("찾는 숫자는 " + (packet + 1) + "번째에 있습니다.");
				break;
			}
		}
		if (first > last) {
			System.out.println("찾으려는 숫자가 없습니다.");
		}
	}

	void SequantialSearch(int[] arr, int findNum) {
		for (int i = 0; i < arr.length; i++) {
			if (findNum == arr[i]) {
				System.out.println("찾으려는 숫자는 " + (i + 1) + "번째에 있습니다.");
				break;
			}
		}
	}
}

public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 6, 7, 5, 1, 9, 8, 10 };
		Sort sort = new Sort();
		Search search = new Search();

		// sort.InsertSort(arr);
		sort.SelectSort(arr);
		sort.printArr(arr);
		search.BinarySearch(arr, 1);

	}

}
