package p0414;
class StaticTest{
	int a;			// �Ϲ� ������� - �޸𸮸� heap���Ҵ� (class ��ü �����̹Ƿ�)
	static int b;	// static ������� - �޸𸮸� Static�� �Ҵ�	
					//���α׷� ���۽� �ڵ����� ��������Ƿ� �ʱ�ȭ�� �ѹ��ۿ� �����������
	void addNum(){
		a++;
		b++;
	}
	void PrintNum(){
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest.b = 10;  // ���α׷� ���۽� �̹� ����/ �ʱ�ȭ�� �Ϸ�Ǿ��⶧���� STaticTest ��ü ���������� ���� �Ҵ��Ҽ� �ִ�.
		StaticTest st1 = new StaticTest();
		st1.addNum();
		st1.PrintNum();
		
		StaticTest st2 = new StaticTest();
		st2.addNum();
		st2.PrintNum();
		
		StaticTest st3 = new StaticTest();
		st3.addNum();
		st3.PrintNum();

		System.out.println(StaticTest.b);	//��ü�Ҽ��� Static �޸� ������ ����ؾ� Warning�� �����ʴ´�.
		System.out.println(st2.b);
	}

}
