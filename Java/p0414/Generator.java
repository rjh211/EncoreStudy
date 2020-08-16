package p0414;
class Test{
	String name;
	int age;
	Test(){
		name = "no name";
		age = 0;
	}
	Test(String name, int age){
		this.name = name;
		this.age = age;
	}
	void PrintInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

class Count{
	static int count;
	Count(){
		count++;
	}
	static void print(){
		System.out.println("현재까지 생성된 객체의 개수는 "+count+"개 입니다.");
	}
}
public class Generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test test = new Test();
//		test.PrintInfo();
//		Test test2 = new Test("aaa", 4);
//		test2.PrintInfo();
		Count count1 = new Count();
		Count count2 = new Count();
		Count count3 = new Count();
		Count count4 = new Count();
		Count count5 = new Count();
		Count.print();
	}

}
