package p0421;

public class Rectangle extends Shape{
	public Rectangle(){super.name = "�簢��";}
	public Rectangle(Point pt1, Point pt2, double length){
		super.point = new Point[]{pt1,pt2};
		super.length = length;
		super.name = "�簢��";
	}
	public void Draw(){
		super.Draw();
		System.out.println("�簢���� �»� ��ǥ : {"+ point[0].GetX() + ","+point[0].GetY()+"}");
		System.out.println("�簢���� ���� ��ǥ : {"+ point[1].GetX() + ","+point[1].GetY()+"}");
		System.out.println("�簢���� �밢�� ���� : " + length);
	}
}
