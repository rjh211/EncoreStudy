package p0421;

import java.awt.Frame;

	
class MyFrame extends Frame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i = 0;i<10;i++){
			this.setTitle("my frame:"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Test{
	public static void main(String[] args){
		MyFrame mf = new MyFrame();
		mf.setSize(300,200);
		mf.setVisible(true);
		Thread th = new Thread(mf);
		th.start();
	}
}