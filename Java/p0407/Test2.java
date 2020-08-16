package p0407;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동 컨버전
		System.out.println(5/2);
		System.out.println(5.0/2);
		
		
		//숫자 리터럴(상수값)
		double d= (double)5/2;
		float f = 3.14f;
		long l = 2000L;
		
		int a = 10;
		int b = 0x3af2;
		int c = 0b100101;
		
		//문자 리터럴
		char x = 'a';
		String z = "abc";

		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbbb");
		System.out.println("aaa\"b\"bb");
	}

}
