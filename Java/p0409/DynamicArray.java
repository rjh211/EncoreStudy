package p0409;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{1,2,3},{1,2,3,4}};//c에서는 2차원배열 내부에 참조값을 갖는것이아니라 실제 배열이 들어가기때문에 가변 배열을 만들수없다.
		
		for(int i = 0 ; i< arr.length;i++){
			for(int j = 0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
