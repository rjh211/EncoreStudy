package p0420;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Parent2("parent",54);
		p.PrintPerson();
		Child2 c = new Child2("child",24,"취미");
		c.PrintPerson();
		//재정의된 메서드의 정적결합 : 컴팡일시 결정, 타입을 따라감
		//자식 객체에서 부모의 함수를 호출하고싶다면 super사용
		//super: 부모객체, super(): 보무객체의 생성자
	}

}
