package p0428;

import java.util.ArrayList;

public class ArrayData {
	private ArrayList<Integer> intArr = null;
	ArrayData(){
		intArr = new ArrayList<Integer>(10);
	}
	public synchronized void PushArr(int num){
		intArr.add(num);
		System.out.println("삽입 : "+num);
		if(intArr.size() >= 3){
			notifyAll();
		}
		try {
			System.out.println("삽입 쓰레드 대기");
								
			wait();
				
			System.out.println("삽입 쓰레드 재개");
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("남은 배열 개수 : "+ intArr.size());
	}
	

	public synchronized void PopArr(){
		int num = intArr.remove(0);
		System.out.println("제거  : "+num);
		if(intArr.size() <= 7){
			notifyAll();
		}
		try {
			System.out.println("제거 쓰레드 대기");
			wait();
			System.out.println("제거 쓰레드 재개");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("남은 배열 개수 : "+ intArr.size());
		
	}
}
