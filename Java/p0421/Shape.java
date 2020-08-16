package p0421;
class Point{
	private int x;
	private int y;
	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int GetX(){
		return this.x;
	}
	public int GetY(){
		return this.y;
	}
	public void SetX(int x){
		this.x = x;
	}
	public void SetY(int y){
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
public class Shape {
	protected Point[] point;	//원 1개 삼각형 + 반지름 3개 사각형 2개 + 대각선길이 필요
	protected double length;
	protected String name;
	public void Draw(){
		System.out.println(name + "을 그린다.");
	}
}
