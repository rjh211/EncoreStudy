package p0428;

public class Data {
	private int num =0 ;
	public synchronized void add(int x){
		num += x;
		System.out.println("���� ����, num = " + num);
		if(num > 40){
			notifyAll();
			try {
				System.out.println("���� ������ wait");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void sub(int x){
		num -= x;
		System.out.println("���� ����, num = " + num);
		if(num < 20){
			notifyAll();
			try {
				System.out.println("���� ������ wait");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
