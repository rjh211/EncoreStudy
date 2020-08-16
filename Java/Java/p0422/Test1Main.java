package p0422;

class Test1 implements Cloneable {
int x,y;
public Test1(){}
public Test1(int x, int y){
	this.x = x;
	this.y = y;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
/*	public boolean equals(Object obj){
		if(obj != null && obj instanceof Test1){
			Test1 obj2 = (Test1)obj;
			if(x==obj2.x && y==obj2.y){
				return true;
			}
		}
		return false;
	}*/
}


public class Test1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1(3,4);
		Test1 t2 = null;
		Test1 t3 = null;
		try{
			t2 = (Test1) t1.clone();		//clone의 반황타입은 Object이기때문에 원래 객체로 다운캐스팅 해줘야함
			t3 = t1;
			
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		System.out.println("t1 참조값 : " + t1.hashCode());
		System.out.println("t2 참조값 : " + t2.hashCode());
		System.out.println("t3 참조값 : " + t3.hashCode());
		System.out.println(t1.equals(t2));
	}

}
