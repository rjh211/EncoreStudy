package p0409;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{1,2,3},{1,2,3,4}};//c������ 2�����迭 ���ο� �������� ���°��̾ƴ϶� ���� �迭�� ���⶧���� ���� �迭�� ���������.
		
		for(int i = 0 ; i< arr.length;i++){
			for(int j = 0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
