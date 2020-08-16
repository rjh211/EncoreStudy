package p0423;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		Iterator<String> it = al.iterator(); // al의 iterator를 반환 반환될 값의 타입을 제너릭으로 입력해줘야함 == for(String s : al)
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(it);
		System.out.println(al.get(0).hashCode());
		System.out.println(al.get(1).hashCode());
		System.out.println(al.get(2).hashCode());
	}

}
