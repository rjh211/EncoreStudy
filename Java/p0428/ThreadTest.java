package p0428;
class Test extends Thread{

	@Override
	public void run() {		//run(): ������ ���۱���, ������ ����� �� �޼��带 �����ϰ�, �̸޼��忡 ���̻� ������ �ڵ尡 ���ٸ� ������ ����
		// TODO Auto-generated method stub
		super.run();
		for(int i = 1;i<27;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.start();
		for(char i = 'a' ;i<'z';i++){
			System.out.print(i+" ");
		}
	}
}
