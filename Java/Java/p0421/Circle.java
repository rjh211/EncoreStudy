package p0421;

public class Circle extends Shape{
	public Circle(){ super.name = "원"; }
	public Circle(Point pt, double length){
		super.point = new Point[]{pt};
		super.length = length;
		super.name = "원";
	}
	public void Draw(){
		super.Draw();
		System.out.println("원의 좌표 : {"+ point[0].GetX() + ","+point[0].GetY()+"} 반지름 : "+ length);
	}
}
