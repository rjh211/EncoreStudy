package p0414;
class StaticInitialization{
	//1. 멤버변수 기본값 할당
	int a =1 ;
	static int b=2;
	
	//2. 초기화 블록
	{
		System.out.println("일반 멤버 초기화 블록");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a = 10;
	}
	
	static{//static 멤버만 초기화하는 블록
		System.out.println("static 멤버 초기화 블록");
		System.out.println("b: "+b);
		b = 20;	//객체 생성전에는 a가 만들어져있지 않기때문에 a는 초기화 불가
	}
	//3. 생성자에 의한 초기화
	StaticInitialization(){
		System.out.println("생성자");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a = 30;
		b = 40;
	}
	
	void PrintMem(){
		System.out.println("print 메서드");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
public class StaticInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInitialization SI = new StaticInitialization();
		SI.PrintMem();
	}

}
