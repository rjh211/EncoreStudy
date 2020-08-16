package p0408;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 3, 6, 2, 9, 1, 7, 4 };
		int position = 0;
		for (int i = 0; i<arr.length ; i++){
			int min = 100;
			for(int j = i; j< arr.length;j++){
				if(arr[j] < min){
					min = arr[j];
					position = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[position];
			arr[position] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
