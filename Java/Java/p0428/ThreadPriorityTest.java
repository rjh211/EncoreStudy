package p0428;
class PriorityTest extends Thread{
	@Override
	public void run() {		//run(): 스레드 동작구현, 스레드 실행시 이 메서드를 실행하고, 이메서드에 더이상 실행할 코드가 없다면 쓰레드 종료
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
		System.out.println(getName() + "쓰레드 종료 / 우선순위 " + getPriority());
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
