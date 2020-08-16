package p0420;

public class Parent2 {
	String name;
	int age;
	
	public Parent2(){}
	public Parent2(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void PrintPerson(){
		System.out.println("name : "+name+"/age : "+age);
	}
}
