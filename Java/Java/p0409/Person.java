package p0409;

public class Person {
	String name;
	int age;
	
	void setInfo(int a, String n){
		this.name = n;
		this.age = a;
	}
	
	void printInfo(){
		System.out.println("���� : "+this.age);
		System.out.println("�̸� : "+this.name);
		System.out.println(this);
	}
}
