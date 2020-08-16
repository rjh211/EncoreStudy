package p0413;

public class ModifierTest1 {
	private int a;
	int b;
	public int c;
	public ModifierTest1(){
		a = 1;
		b = 1;
		c = 1;
	}
	
	public void PrintMem(){
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println("c: " +c);
		test1();
	}
	private void test1(){
		System.out.println("클래스 내에서만 호출");
	}
	void test2(){
		System.out.println("패키지 내에서만 호출");
	}
	public void test3(){
		System.out.println("클래스 밖에서도 호출");
	}
	public void test4(){
		System.out.println("클래스 내에서만 호출");
	}
}
