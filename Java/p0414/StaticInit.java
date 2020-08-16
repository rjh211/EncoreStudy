package p0414;
class StaticInitialization{
	//1. ������� �⺻�� �Ҵ�
	int a =1 ;
	static int b=2;
	
	//2. �ʱ�ȭ ���
	{
		System.out.println("�Ϲ� ��� �ʱ�ȭ ���");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a = 10;
	}
	
	static{//static ����� �ʱ�ȭ�ϴ� ���
		System.out.println("static ��� �ʱ�ȭ ���");
		System.out.println("b: "+b);
		b = 20;	//��ü ���������� a�� ����������� �ʱ⶧���� a�� �ʱ�ȭ �Ұ�
	}
	//3. �����ڿ� ���� �ʱ�ȭ
	StaticInitialization(){
		System.out.println("������");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a = 30;
		b = 40;
	}
	
	void PrintMem(){
		System.out.println("print �޼���");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
public class StaticInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInitialization SI = new StaticInitialization();
		SI.PrintMem();
	}

}
