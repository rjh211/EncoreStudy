package p0422;

public class ExceptionProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 발생전");
		try{			
			int x = 3/0;
		} catch(ArithmeticException e){		//try에서 던진 예외 객체를 받음 (종류가 일치하는 예외만 받음)
			e.printStackTrace();
			System.out.println("0으로 나눌수없습니다.");
		} catch(NullPointerException e){
			e.printStackTrace();
		} finally{
			System.out.println("예외가 나든 안나던 출력됨");
		}
		System.out.println("출력안됨");
	}

}
