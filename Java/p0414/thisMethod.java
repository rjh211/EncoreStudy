package p0414;
class Test5{
	String name,tel,address;
	Test5(){
		this("aaa","111");		//다른 생성자 호출 , 실행문보다 앞에있어야함
		System.out.println("디폴트 생성자");
	}
	Test5(String name, String tel){
		this(name,tel,"대한민국");
		System.out.println("파라밈터 2개 생성자");
	}
	Test5(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
		System.out.println("파일 3개 생성자");
		System.out.println("name : "+ name);
		System.out.println("tel : "+ tel);
		System.out.println("address : "+ address);
	}
}
public class thisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test = new Test5();
	}

}
