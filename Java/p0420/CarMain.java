package p0420;
class Car{
	String name;
	public void beep(){
		System.out.println("����");
	}
}
class �ҹ��� extends Car{
	public �ҹ���(){
		name = "�ҹ���";
	}
	public void beep(){
		System.out.println("��~~~~��");
	}
}
class ����� extends Car{
	public �����(){
		name = "�����";
	}
	public void beep(){
		System.out.println("�����");
	}
}
class �ں深�� extends Car{
	public �ں深��(){
		name = "�ں深��";
	}
	public void beep(){
		System.out.println("�߿��߿�");
	}
}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		car = new �ҹ���();
		car.beep();
	}

}
