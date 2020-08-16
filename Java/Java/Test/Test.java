package Test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hello";
		Integer val = 1;
		test(val);
		System.out.println(string);
		
	}
	public static void test(String param){
		param+= " World";
	}
	public static int test(Integer a){
		a++;
		return a;
	}
}
