package p0421;
 abstract class GrandParents{
	 int a=1;
	 abstract public void test1();
	 public abstract void test2();
	 public void test3(){
		 System.out.println("이 메서드는 GrandParent에서 구현함");
		 System.out.println(a);
	}	
}
 abstract class Parents extends GrandParents{
	 int b=10;
	@Override
	public void test2() {
		// TODO Auto-generated method stub
		 System.out.println("이 메서드는 Parent에서 구현함");
		 System.out.println(a+b);
		
	}	 
 }
 class Childs extends Parents{	//Child만 완성된 클래스이므로 객체로 생성가능
	 int c = 100;
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		 System.out.println("이 메서드는 Child에서 구현함");
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
