package p0409;
class Point{
	int x;
	int y;
	
	void SetXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	void PrintXY(){
		System.out.print(" {"+x+","+y+"} ");
	}
}

class Circle{
	int radius;
	Point point = new Point();
	void SetCircle(int x, int y, int rad){
		this.point.SetXY(x, y);
		this.radius = rad;
	}
	void Draw(){
		System.out.print("중심점 : ");
		point.PrintXY();
		System.out.println("에 반지름 "+this.radius+" 로 그림");
	}
}
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.SetCircle(0, 0, 3);
		circle.Draw();
	}

}
