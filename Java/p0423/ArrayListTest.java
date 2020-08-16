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
		System.out.println("초기 배열");
		PrintAll(al);
		
		System.out.println("1번방 객체의 x를 20으로 변환");
		al.set(1, new A(20));
		System.out.println("x가 3인 객체를 검색하여 위치 출력");
		
		int index = -1;
		
		for(int i =0 ;i<al.size();i++){
			if(al.get(i).equals((Object) new A(3))){
				System.out.println(i+"번째 위치해있다.");
				index = i;
				break;
			}
		}
		if(al.contains(new A(3))){		//API의 함수들은 Object형식으로 입력을 주어야 하므로 Equals등 재정의흘 할때 Object parameter input에대한 재정의를 해야함
			System.out.println(al.indexOf(new A(3)) + "위치에 있음");
		}
		System.out.println("x가 3인 객체 삭제후 전체 요소 출력");
		al.remove(al.indexOf(new A(3)));
		PrintAll(al);
		
		System.out.println("0번 요소 삭제후 전체요소 출력");
		al.remove(0);
		PrintAll(al);
		
		System.out.println("객체요소 모두 삭제후 비었는가 확인");
		al.clear();
		if(al.isEmpty()){
			System.out.println("비었음");
		}
	}
	
	void PrintAll(ArrayList<A> al){
		for(int i = 0; i<al.size();i++){
			System.out.print(al.get(i) + "\t");
		}
		System.out.println();
	}
	
}

public class ArrayListTest {		//어떤 타입이든 저장 가능
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
		
		if(al.contains("aaa")){			//value의 존재유무 반환 객체의 value를확인하기위해 equal을 재정의 해야함
			System.out.println(al.indexOf("aaa")+"에 위치해있다.");	//value의 index를 반환 없으면 -1반환
		} else{
			System.out.println("없다.");
		}
		System.out.println("b삭제");
		al.remove("bbb");				//삭제를 할수잇으면 true반환후 삭제, 없으면 false반환

		for(int i =0 ;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("0번방삭제");
		al.remove(0);

		for(int i =0 ;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("전체 삭제");
		al.clear();
		if(al.isEmpty()){
			System.out.println("리스트 비었음");
		}
		
		al.add(0,"eee"); // 0번방에 eee를넣고 나머지는 뒤로 미룸
*/	}
}
