package p0409;

//ĸ��ȭ

public class PersonMain {
	public static void main(String[] args){
		Person person = new Person();		//new �Ҷ� Ŭ���������� ������ Ÿ���� ũ�⸦ �ٴ��Ѹ�ŭ �޸𸮰� ���� �Ҵ�ȴ�.
		person.age = 1;
		person.name = "aaa";
		
		
		Person person2 = new Person();
		person2.age = 2;
		person2.name = "bbb";

		System.out.println("age\tname");
		System.out.println(person.age + "\t" + person.name);
		System.out.println(person2.age + "\t" + person2.name);
		
		Person person3 = person;

		System.out.println(person);			//�ּ� ��½� Ÿ��@�ּ� �� ��µȴ�.
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
