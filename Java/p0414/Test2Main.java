package p0414;
class Test2{
	int a;
	static int b;				// ��� ��ü���� �����ؾ��Ҷ� static ���
	
	void test1(){				//�Ϲ� �޼���� �Ϲ� ������  static���� ��� ��� �����ϴ�.
		System.out.println(a);
		System.out.println(b);
	}
	static void test2(){		//static �޼���� stack�� �Ҵ�ȴ�. ��ü�� ������ �������
		System.out.println(a);	//�Ϲ� ��� ������ ��ü ���������� ���� ������ ����� �Ұ����ϴ�
		System.out.println(b);	//static �޼���� static ������ ��밡���ϴ�.
	}
	void test3(){				//�Ϲ� �޼���
		test1();				//�Ϲ� �޼��� ȣ�Ⱑ��
		test2();				//static �޼��� ȣ�� ����
	}
	static void test4(){
		test1();				//���α׷� �ʱ⿡ test3�Լ��� �Ҵ���� �ʾұ⶧���� �Լ����ο��� ����Ҽ� ����.
		test2();
	}
}
public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.b = 30;
		double a = Math.PI; //math�Ͱ��� lib�� static���·� ����Ǿ��⶧���� ��ü�� ������ �ʿ䰡 ����.
		Test2.test2();
		Test2.test4();			///��ü ��������� ��밡��
		Test2 test2 = new Test2();
		test2.a = 0;
		test2.b = test2.a;		//��ü �����Ŀ��� ��밡��
	}

}
