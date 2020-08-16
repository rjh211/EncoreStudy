package p0420;
class GrandParent{
	private int a;
	int b;
	protected int c;
	public int d;
	protected String name;
	public GrandParent(){
		System.out.println("GrandParent 积己磊");
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
		name = "GrandParent";
	}
	
	public void GrandMethod(){
		System.out.println("GrandParent 窃荐");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println("c : "+ c);
		System.out.println("d : "+ d);
	}
}

class Parent extends GrandParent{
	private int e;
	int f;
	protected int g;
	public int h;
	
	public Parent(){
		System.out.println("Parent 积己磊");
		e = 50;
		f = 60;
		g = 70;
		h = 80;
		name = "Parent";
	}
	public Parent(int a){
		System.out.println("param Parent 积己磊");
	}
	public void ParentMethod(){
		super.GrandMethod();
		System.out.println("Parent 窃荐");
		System.out.println("e : "+ e);
		System.out.println("f : "+ f);
		System.out.println("g : "+ g);
		System.out.println("h : "+ h);
	}
}

class Child extends Parent2{
	public String hobby;
	public Child(){
		super(1);
		System.out.println("Child 积己磊");
		name = "child";
		hobby = "冀家迄";
	}
}

public class Inherience {
	public static void main(String[] args){
		/*GrandParent gp = new GrandParent();
		gp.GrandMethod();
		System.out.println("===============");
		Parent p = new Parent();
		p.GrandMethod();
		p.ParentMethod();*/
		Child child = new Child();
	}
}
