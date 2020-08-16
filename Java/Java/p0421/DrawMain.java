package p0421;

public class DrawMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[10];
		shape[0] = new Circle(new Point(1,2), 3);
		shape[1] = new Rectangle(new Point(1,2), new Point(2,3), 3);
		shape[2] = new Triangle(new Point(1,2), new Point(2,3), new Point(4,5));
		shape[3] = new Circle(new Point(1,2), 3);
		shape[4] = new Circle(new Point(1,2), 3);
		shape[5] = new Circle(new Point(1,2), 3);
		shape[6] = new Circle(new Point(1,2), 3);
		shape[7] = new Circle(new Point(1,2), 3);
		shape[8] = new Circle(new Point(1,2), 3);
		shape[9] = new Circle(new Point(1,2), 3);
		
		Rectangle rect = (Rectangle)shape[1];
		
		
		for(Shape sh : shape){
			sh.Draw();
		}
		rect.Draw();
	}

}
