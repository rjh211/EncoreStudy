package p0428;
class RTest implements Runnable{		//��¥ �����尡�ƴ϶� ���߻���� ���� ���� class�μ� �����带 �����Ͽ� ���۽��Ѿ���

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i<27;i++)
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}
public class RunableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RTest t = new RTest();
		Thread th = new Thread(t);
		th.start();
		for(char i = 'a' ;i<'z';i++){
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
