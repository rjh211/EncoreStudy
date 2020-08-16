package p0421;

public class Rectangle extends Shape{
	public Rectangle(){super.name = "사각형";}
	public Rectangle(Point pt1, Point pt2, double length){
		super.point = new Point[]{pt1,pt2};
		super.length = length;
		super.name = "사각형";
	}
	public void Draw(){
		super.Draw();
		System.out.println("사각형의 좌상 좌표 : {"+ point[0].GetX() + ","+point[0].GetY()+"}");
		System.out.println("사각형의 우하 좌표 : {"+ point[1].GetX() + ","+point[1].GetY()+"}");
		System.out.println("사각형의 대각선 길이 : " + length);
	}
}
