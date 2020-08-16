package p0420;

public class Son extends Parent2 {
	public void Test(){
		System.out.println("GrandParent method");	//parent 상속관계
		//System.out.println("a : " + a);
		//System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	other o = new other();
}
class other{
	private Parent2 p;
	public other(){
		p = new Parent2();	//parent 포함관계	Protected 와 Default는 같은 패키지내에서 접근가능
	}
	public void Test(){
		System.out.println("other method");
		//System.out.println("a : " + p.a);
		//System.out.println("b : " + p.b);
		System.out.println("c : " + p.c);
		System.out.println("d : " + p.d);
	}
}