package p0423;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
class PropertiesTest{
	public void Run(){
		Properties prop = new Properties();
		prop.put("service ip", "192.168.0.1");
		prop.put("port", "8000");
		prop.put("id", "scott");
		prop.put("pw", "tiger");
		FileOutputStream os;
		try {
			os = new FileOutputStream("src/p0423/data.xml");		//Properties의 key값과 value를 xml파일로 저장
			prop.storeToXML(os, "Properties test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "aaa");
		map.put("tel", "111");
		map.put("addr", "서초");

		System.out.println("name : " + map.get("name"));
		System.out.println("tel : " + map.get("tel"));
		System.out.println("addr : " + map.get("addr"));
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());			//next마다 it가 증가함	name
			System.out.println(it.next() + " : " + map.get(it.next()));	// tel 서초 출력
		}
		
		map.remove("tel");
		System.out.println("name : " + map.get("name"));
		System.out.println("tel : " + map.get("tel"));
		System.out.println("addr : " + map.get("addr"));
		
		map.put("tel", "222");					//key로 수정
		System.out.println("name : " + map.get("name"));
		System.out.println("tel : " + map.get("tel"));
		System.out.println("addr : " + map.get("addr"));
		
		Iterator<String> it1 = map.keySet().iterator();
		Iterator<String> it2 = map.values().iterator();
		while(it1.hasNext()){
			System.out.println(it1.next() + " : " + it2.next());
		}
		PropertiesTest pt = new PropertiesTest();
		pt.Run();
	}

}
