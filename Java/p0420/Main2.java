package p0420;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Parent2("parent",54);
		p.PrintPerson();
		Child2 c = new Child2("child",24,"���");
		c.PrintPerson();
		//�����ǵ� �޼����� �������� : �����Ͻ� ����, Ÿ���� ����
		//�ڽ� ��ü���� �θ��� �Լ��� ȣ���ϰ�ʹٸ� super���
		//super: �θ�ü, super(): ������ü�� ������
	}

}
