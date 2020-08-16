package p0422;
class A{
	int x = 10;
}
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = null;
		int[] b = {1,2,3,4};
		int res;
		try{
			System.out.println("1");
			//System.out.println(a.x);
			System.out.println("2");
			for(int i =0 ;i<=b.length;i++){
				System.out.println(b[i]+"\t");
			}
			System.out.println("\n3");
			res = 3/0;
			System.out.println("4");
		} catch(NullPointerException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("5");
	}
}
