package p0421;
 abstract class GrandParents{
	 int a=1;
	 abstract public void test1();
	 public abstract void test2();
	 public void test3(){
		 System.out.println("�� �޼���� GrandParent���� ������");
		 System.out.println(a);
	}	
}
 abstract class Parents extends GrandParents{
	 int b=10;
	@Override
	public void test2() {
		// TODO Auto-generated method stub
		 System.out.println("�� �޼���� Parent���� ������");
		 System.out.println(a+b);
		
	}	 
 }
 class Childs extends Parents{	//Child�� �ϼ��� Ŭ�����̹Ƿ� ��ü�� ��������
	 int c = 100;
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		 System.out.println("�� �޼���� Child���� ������");
		 System.out.println(a+b+c);
		
	}
	 
 }
public class AbstractTest {
	public static void main(String[] args){
		//GrandParents gp = new GrandParents();
		//Parents p = new Parents();
		Parents p = new Childs();
		p.test1();
		Childs c = new Childs();
		c.test1();
		c.test2();
		c.test3();
	}
}
