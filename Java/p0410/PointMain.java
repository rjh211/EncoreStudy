package p0410;
class Point{
	int x;
	int y;
	 void SetXY(int x, int y){
		 this.x = x;
		 this.y = y;
	 }
	 
	 void PrintXY(){
		 System.out.println("{"+x+","+y+"}");
	 }
}
public class PointMain {
	public static void main(String[] args){
		Point[] point = new Point[2];
		for(int i =0; i<point.length;i++){
			point[i] = new Point();
			point[i].SetXY(i+1, i+1);
			point[i].PrintXY();
		}
	}
}

