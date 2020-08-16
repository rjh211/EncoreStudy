package p0421;

import p0408.SelectSort;

interface Max{
	int max(int[] a);
}
interface Sort{
	int[] sort(int[] a);
}
class MyArr implements Max, Sort{

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		int[] arr = new int[a.length];
		System.arraycopy(a, 0, arr, 0, a.length);
		for(int i =0 ;i<arr.length-1;i++){
			for(int j =0 ;j< arr.length - 1 - i;j++){				
				if(arr[j+1]<arr[j]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	@Override
	public int max(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
		for(int i =0 ;i<a.length;i++){
			if(a[i] > max) max = a[i];
		}
		return max;
	}
	
}
public class MultiImplement {
	public static void main(String[] args){
		int[] t = new int[]{3,6,5,4,7,8,1,9,2};
		MyArr ma = new MyArr();
		int[] sortedArr = ma.sort(t);
		int max = ma.max(t);
		System.out.println("원본배열");
		for(int i : t){
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("정렬된배열");
		for(int i : sortedArr){
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("최대값 : "+ max);
	}
}
