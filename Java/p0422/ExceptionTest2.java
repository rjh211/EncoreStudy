package p0422;

import java.io.IOException;
class Test{
	public void test() throws IOException{
		int ch;
		while ((ch = System.in.read()) != '\n') {
			System.out.print((char) ch);
		}
	}
	public void test2() {
		String str = null;
		char ch = str.charAt(0);
		System.out.println("Ã¹ ¹®ÀÚ : " + ch);
	}
	public void test3(){
		test2();
	}
	public void test4(){
		test3();
	}
}
public class ExceptionTest2 {
	public static void main(String[] args){
		Test t = new Test();
		try {
			t.test4();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
