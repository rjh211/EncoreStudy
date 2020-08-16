package p0428;
class Test extends Thread{

	@Override
	public void run() {		//run(): 스레드 동작구현, 스레드 실행시 이 메서드를 실행하고, 이메서드에 더이상 실행할 코드가 없다면 쓰레드 종료
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
