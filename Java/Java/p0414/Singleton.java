package p0414;

import java.sql.Date;
import java.util.Calendar;

class Test10{
	String str;
	private static Test10 t = new Test10();
	public static Test10 getInstance(){
		return t;
	}
	public String getStr(){
		return str;
	}
}
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 test = Test10.getInstance();
		System.out.println(test.getStr());
		
		Calendar calendar = Calendar.getInstance();
		Date d = (Date) calendar.getTime();
		
	}

}
