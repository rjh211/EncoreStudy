package p0428;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Test4 extends Thread{
	@Override
	public void run() {		//run(): 스레드 동작구현, 스레드 실행시 이 메서드를 실행하고, 이메서드에 더이상 실행할 코드가 없다면 쓰레드 종료
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
			System.out.println("파일 읽기 쓰레드 종료");
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
