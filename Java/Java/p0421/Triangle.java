package p0421;

public class Triangle extends Shape{
	public Triangle(){super.name = "�ﰢ��";}
	public Triangle(Point pt1, Point pt2, Point pt3){
		super.point = new Point[]{pt1,pt2,pt3};
		super.name = "�ﰢ��";
	}
	public void Draw(){
		super.Draw();
		System.out.println("�ﰢ���� ������ ��ǥ1 : {"+ point[0].GetX() + ","+point[0].GetY()+"}");
		System.out.println("�ﰢ���� ������ ��ǥ2 : {"+ point[1].GetX() + ","+point[1].GetY()+"}");
		System.out.println("�ﰢ���� ������ ��ǥ3 : {"+ point[2].GetX() + ","+point[2].GetY()+"}");
	}
}
