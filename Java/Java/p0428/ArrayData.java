package p0428;

import java.util.ArrayList;

public class ArrayData {
	private ArrayList<Integer> intArr = null;
	ArrayData(){
		intArr = new ArrayList<Integer>(10);
	}
	public synchronized void PushArr(int num){
		intArr.add(num);
		System.out.println("���� : "+num);
		if(intArr.size() >= 3){
			notifyAll();
		}
		try {
			System.out.println("���� ������ ���");
								
			wait();
				
			System.out.println("���� ������ �簳");
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� �迭 ���� : "+ intArr.size());
	}
	

	public synchronized void PopArr(){
		int num = intArr.remove(0);
		System.out.println("����  : "+num);
		if(intArr.size() <= 7){
			notifyAll();
		}
		try {
			System.out.println("���� ������ ���");
			wait();
			System.out.println("���� ������ �簳");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� �迭 ���� : "+ intArr.size());
		
	}
}
