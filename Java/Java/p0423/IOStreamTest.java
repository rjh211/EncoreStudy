package p0423;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class IOStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/p0423/data.xml";
		FileInputStream fi = null;									//stream 생성
		Properties prop = new Properties();
		
		try{
			fi = new FileInputStream(path);
			prop.loadFromXML(fi);									//stream을 통해 xml파일에서 Properties 객체에 데이터 가져오기
			fi.close();												//사용을 마친 stream 제거
		} catch(Exception e){
			e.printStackTrace();
		}
		Iterator<Object> it = prop.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			System.out.println(key + " : " + prop.getProperty(key));
		}
	}

}
