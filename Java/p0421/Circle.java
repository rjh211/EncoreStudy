package p0421;

public class Circle extends Shape{
	public Circle(){ super.name = "��"; }
	public Circle(Point pt, double length){
		super.point = new Point[]{pt};
		super.length = length;
		super.name = "��";
	}
	public void Draw(){
		super.Draw();
		System.out.println("���� ��ǥ : {"+ point[0].GetX() + ","+point[0].GetY()+"} ������ : "+ length);
	}
}
