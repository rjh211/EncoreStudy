package p0414;
class StaticTest{
	int a;			// 일반 멤버변수 - 메모리를 heap에할당 (class 객체 변수이므로)
	static int b;	// static 멤버변수 - 메모리를 Static에 할당	
					//프로그램 시작시 자동으로 만들어지므로 초기화가 한번밖에 진행되지않음
	void addNum(){
		a++;
		b++;
	}
	void PrintNum(){
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest.b = 10;  // 프로그램 시작시 이미 생성/ 초기화가 완료되었기때문에 STaticTest 객체 생성전에도 값을 할당할수 있다.
		StaticTest st1 = new StaticTest();
		st1.addNum();
		st1.PrintNum();
		
		StaticTest st2 = new StaticTest();
		st2.addNum();
		st2.PrintNum();
		
		StaticTest st3 = new StaticTest();
		st3.addNum();
		st3.PrintNum();

		System.out.println(StaticTest.b);	//객체소속의 Static 메모리 변수로 사용해야 Warning이 뜨지않는다.
		System.out.println(st2.b);
	}

}
