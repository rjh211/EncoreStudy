package p0420;

public class Child2 extends Parent2 {
	String hobby;
	public Child2(String name, int age, String hobby){
		super(name, age);
		this.hobby = hobby;
	}

	@Override
	public void PrintPerson() {
		// TODO Auto-generated method stub
		// super.PrintPerson();
		System.out.println("name : "+name+"/age : "+age+"/hobby : "+hobby);
	}
	
}
