package p0420;
class Car{
	String name;
	public void beep(){
		System.out.println("»§»§");
	}
}
class ¼Ò¹æÂ÷ extends Car{
	public ¼Ò¹æÂ÷(){
		name = "¼Ò¹æÂ÷";
	}
	public void beep(){
		System.out.println("¾Ö~~~~¾Þ");
	}
}
class ±¼»è±â extends Car{
	public ±¼»è±â(){
		name = "±¼»è±â";
	}
	public void beep(){
		System.out.println("±¼»è±â");
	}
}
class ¾Úºæ·±½º extends Car{
	public ¾Úºæ·±½º(){
		name = "¾Úºæ·±½º";
	}
	public void beep(){
		System.out.println("»ß¿À»ß¿À");
	}
}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		car = new ¼Ò¹æÂ÷();
		car.beep();
	}

}
