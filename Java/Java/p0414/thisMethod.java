package p0414;
class Test5{
	String name,tel,address;
	Test5(){
		this("aaa","111");		//�ٸ� ������ ȣ�� , ���๮���� �տ��־����
		System.out.println("����Ʈ ������");
	}
	Test5(String name, String tel){
		this(name,tel,"���ѹα�");
		System.out.println("�Ķ���� 2�� ������");
	}
	Test5(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
		System.out.println("���� 3�� ������");
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
