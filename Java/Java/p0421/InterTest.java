package p0421;

public interface InterTest {
	int MAX = 100; 		//final static을 안써도 상수처리됨
	void test1();		//public abstract 생략
	void test2();
	void test3();
}

class InterImpl implements InterTest{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	
}
