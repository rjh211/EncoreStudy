package p0428;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Test4 extends Thread{
	@Override
	public void run() {		//run(): ������ ���۱���, ������ ����� �� �޼��带 �����ϰ�, �̸޼��忡 ���̻� ������ �ڵ尡 ���ٸ� ������ ����
		// TODO Auto-generated method stub
		super.run();
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/p0427/files/a.txt"));
			int ch;
			while((ch = br.read()) != -1){
				System.out.print((char)ch + " ");
				if(ch == '\n'){
					Thread.sleep(1000);
				}
			}
			br.close();
			System.out.println("���� �б� ������ ����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t4 = new Test4();
		t4.start();
	}

}
