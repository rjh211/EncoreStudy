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
		System.out.println("Ŭ���� �������� ȣ��");
	}
	void test2(){
		System.out.println("��Ű�� �������� ȣ��");
	}
	public void test3(){
		System.out.println("Ŭ���� �ۿ����� ȣ��");
	}
	public void test4(){
		System.out.println("Ŭ���� �������� ȣ��");
	}
}
