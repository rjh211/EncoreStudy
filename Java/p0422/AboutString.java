package p0422;

public class AboutString {
	public static void main(String[] args){
		String a = "aaa";
		String b = new String("aaa");
		char[] c ={'a','b','c'};
		String d = new String(c);
		String z = "aaa";

		System.out.println("a == z : " + a == z);
		System.out.println("a == b : " + a == b);
		System.out.println("b == z : " + b == z);
		System.out.println("a.equals(z) : " + a.equals(z));
		System.out.println("a.equals(b) : " + a.equals(b));
		System.out.println("b.equals(z) : " + b.equals(z));
	}
}
