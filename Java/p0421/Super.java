package p0421;
class Parent{
	int x = 10;
	public Parent(int a){
		this.x = a;
	}
	public void method(){
		System.out.println("parent Method");
	}
}
//super : 자식 클래스에서 재정의한 멤버변수나 메서드의 부모 버전을 사용하고자 할때 사용
class Child extends Parent{
	int x = 500;
	public Child(int a,int x){
		super(a);
		this.x = x;
	}
	public void method(){
		super.method();
		System.out.println("child에서 method 재정의");
		System.out.println("x: "+x);
	}
}

public class Super {
	public static void main(String[] args){
		Parent parent = new Parent(1);
		parent.method();
		
		Child child = new Child(3,4);
		child.method();
		
	}
}
