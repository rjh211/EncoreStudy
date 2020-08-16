package p0414;

import p0413.ModifierTest1;

public class Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifierTest mt = new ModifierTest();
		System.out.println("생성자에서 할당한 값");
		mt.PrintMem();

		// t.a = 10; // private
		mt.b = 20;
		mt.c = 30;

		// mt.test(1);
		mt.test2();
		mt.test3();

		// TODO Auto-generated method stub
		// 다른패키지의 같은 class
		ModifierTest1 mt1 = new ModifierTest1();
		System.out.println("생성자에서 할당한 값");
		mt1.PrintMem();

		// t.a = 10; // private
		// mt1.b = 20;
		mt1.c = 30;

		// mt.test(1);
		// mt1.test2();
		mt1.test3();
	}

}
