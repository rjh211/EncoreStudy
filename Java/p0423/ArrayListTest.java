package p0423;

import java.util.ArrayList;
import java.util.Vector;

class A{
	int x = 10;
	public A(){}
	public A(int x){
		this.x = x;
	}
	public boolean equals(int x){
		if(this.x == x){
			return true;
		}
		else return false;
	}
	public boolean equals(A a){
		A other = a;
		if( x != other.x)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (x != other.x)
			return false;
		return true;
		//==
/*		if(obj != null && obj instanceof A){
			A obj2 = (A) obj;
			if(x == obj2.x){
				return true;
			} else {
				return false;
			}
		}*/
	}
	public String toString(){
		return "A [x="+x+"]";
	}
}

class Test{
	public void Run(){
		ArrayList<A> al = new ArrayList<A>();
		al.add(new A(1));
		al.add(new A(2));
		al.add(new A(3));
		al.add(new A(4));
		al.add(new A(5));
		System.out.println(al.get(1));
		System.out.println("�ʱ� �迭");
		PrintAll(al);
		
		System.out.println("1���� ��ü�� x�� 20���� ��ȯ");
		al.set(1, new A(20));
		System.out.println("x�� 3�� ��ü�� �˻��Ͽ� ��ġ ���");
		
		int index = -1;
		
		for(int i =0 ;i<al.size();i++){
			if(al.get(i).equals((Object) new A(3))){
				System.out.println(i+"��° ��ġ���ִ�.");
				index = i;
				break;
			}
		}
		if(al.contains(new A(3))){		//API�� �Լ����� Object�������� �Է��� �־�� �ϹǷ� Equals�� �������� �Ҷ� Object parameter input������ �����Ǹ� �ؾ���
			System.out.println(al.indexOf(new A(3)) + "��ġ�� ����");
		}
		System.out.println("x�� 3�� ��ü ������ ��ü ��� ���");
		al.remove(al.indexOf(new A(3)));
		PrintAll(al);
		
		System.out.println("0�� ��� ������ ��ü��� ���");
		al.remove(0);
		PrintAll(al);
		
		System.out.println("��ü��� ��� ������ ����°� Ȯ��");
		al.clear();
		if(al.isEmpty()){
			System.out.println("�����");
		}
	}
	
	void PrintAll(ArrayList<A> al){
		for(int i = 0; i<al.size();i++){
			System.out.print(al.get(i) + "\t");
		}
		System.out.println();
	}
	
}

public class ArrayListTest {		//� Ÿ���̵� ���� ����
	public static void main(String[] args){
		Test test = new Test();
		test.Run();
		/*Vector<Object> al = new Vector<Object>(10);
		System.out.println(new A());
		al.add("asdf");
		al.add(12);
		al.add(3.31f);
		al.add(new A());
		

		al.add("aaa");
		al.add("ccc");
		al.add("bbb");
		al.add("aaa");
		for(int i =0 ;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		if(al.contains("aaa")){			//value�� �������� ��ȯ ��ü�� value��Ȯ���ϱ����� equal�� ������ �ؾ���
			System.out.println(al.indexOf("aaa")+"�� ��ġ���ִ�.");	//value�� index�� ��ȯ ������ -1��ȯ
		} else{
			System.out.println("����.");
		}
		System.out.println("b����");
		al.remove("bbb");				//������ �Ҽ������� true��ȯ�� ����, ������ false��ȯ

		for(int i =0 ;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("0�������");
		al.remove(0);

		for(int i =0 ;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("��ü ����");
		al.clear();
		if(al.isEmpty()){
			System.out.println("����Ʈ �����");
		}
		
		al.add(0,"eee"); // 0���濡 eee���ְ� �������� �ڷ� �̷�
*/	}
}
