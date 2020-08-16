package p0414;
class Test2{
	int a;
	static int b;				// 모든 객체들이 공유해야할때 static 사용
	
	void test1(){				//일반 메서드는 일반 변수와  static변수 모두 사용 가능하다.
		System.out.println(a);
		System.out.println(b);
	}
	static void test2(){		//static 메서드라도 stack에 할당된다. 객체의 유무와 상관없음
		System.out.println(a);	//일반 멤버 변수는 객체 생성전에는 없기 때문에 사용이 불가능하다
		System.out.println(b);	//static 메서드는 static 변수만 사용가능하다.
	}
	void test3(){				//일반 메서드
		test1();				//일반 메서드 호출가능
		test2();				//static 메서드 호출 가능
	}
	static void test4(){
		test1();				//프로그램 초기에 test3함수는 할당되지 않았기때문에 함수내부에서 사용할수 없다.
		test2();
	}
}
public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.b = 30;
		double a = Math.PI; //math와같은 lib는 static형태로 구축되었기때문에 객체를 생성할 필요가 없다.
		Test2.test2();
		Test2.test4();			///객체 사용전에도 사용가능
		Test2 test2 = new Test2();
		test2.a = 0;
		test2.b = test2.a;		//객체 생성후에도 사용가능
	}

}
