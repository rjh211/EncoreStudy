package p0428;
class PriorityTest extends Thread{
	@Override
	public void run() {		//run(): ������ ���۱���, ������ ����� �� �޼��带 �����ϰ�, �̸޼��忡 ���̻� ������ �ڵ尡 ���ٸ� ������ ����
		// TODO Auto-generated method stub
		super.run();
		for(int i = 1;i<101;i++)
		{
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "������ ���� / �켱���� " + getPriority());
	}
}
public class ThreadPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1 ;i<10;i++){
			PriorityTest pt = new PriorityTest();
			pt.setPriority(i);
			pt.start();
		}
	}

}
