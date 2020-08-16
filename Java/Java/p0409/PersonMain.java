package p0409;

//캡슐화

public class PersonMain {
	public static void main(String[] args){
		Person person = new Person();		//new 할때 클래스내부의 변수들 타입의 크기를 다더한만큼 메모리가 힙에 할당된다.
		person.age = 1;
		person.name = "aaa";
		
		
		Person person2 = new Person();
		person2.age = 2;
		person2.name = "bbb";

		System.out.println("age\tname");
		System.out.println(person.age + "\t" + person.name);
		System.out.println(person2.age + "\t" + person2.name);
		
		Person person3 = person;

		System.out.println(person);			//주소 출력시 타입@주소 가 출력된다.
		System.out.println(person2);
		System.out.println(person3);

		person.setInfo(10, "aaa");
		person2.setInfo(20, "bbb");
		person3.setInfo(30, "ccc");

		person.printInfo();
		person2.printInfo();
		person3.printInfo();
	}
}
