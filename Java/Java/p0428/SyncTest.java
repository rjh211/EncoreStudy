package p0428;
class Msg{
	private String st;
	public synchronized void setStr(String str){
		this.st = str;
	}
	public synchronized void PrintStr(){
		System.out.println(st);
	}
}
class sTest extends Thread{
	private Msg msg;

	public sTest(Msg msg){
		this.msg = msg;
	}
	public void run(){
		synchronized(msg){
			for(int i =0 ;i<10; i++){
				msg.setStr("파생 쓰레드");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("파생 쓰레드 str : ");
				msg.PrintStr();
			}
		}
	}

}
public class SyncTest{
	public static void main(String[] args){
		Msg msg = new Msg();
		sTest stest = new sTest(msg);
		
		stest.start();
		synchronized(msg){
			for(int i =0 ;i<10 ;i++){
				msg.setStr("Main Thread");
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("main Thread str :");
				msg.PrintStr();
				
			}
		}
	}
}