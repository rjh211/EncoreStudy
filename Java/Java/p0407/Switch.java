package p0407;

public class Switch {
	public static void main(String[] args) {
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("x는 1");
			break;
		case 2:
			System.out.println("x는 2");
			break;
		case 3:
			System.out.println("x는 3");
			break;
		default:
			System.out.println("x는 이외의 값");

		}
		//int  형
		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		case 'c':
			System.out.println("c");
			break;
		default:
			System.out.println("이외의 값");

		}
		//char  형
		String str = "aaa";
		switch (str) {
		case "aaa":
			System.out.println("aaa");
			break;
		case "bbb":
			System.out.println("bbb");
			break;
		case "CCC":
			System.out.println("ccc");
			break;
		default:
			System.out.println("이외의 값");

		}
		//String  형
	}
}