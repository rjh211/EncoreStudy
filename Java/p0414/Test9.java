package p0414;

public class Test9 {
	private int age;
	public int GetAge() {
		return age;
	}

	public Test9(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public void SetAge(int age) {
		this.age = age;
	}



	private String name;

	public String GetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public Test9() {

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t = new Test9();
		t.SetName("aaa");
		t.SetAge(1);
	}

}
