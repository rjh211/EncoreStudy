package Pokemon;

public class Squirtle extends Pokemon {
	Squirtle(){
		super();
		hp = 25;
		name = "���α�";
	}
	public void Eat(){
		hp += 5;
	}
	public void Sleep(){
		hp += 10;
	}
	public void Excercise(){
		hp -= 10;
		exp += 10;
		if(super.UpdateState()){
			System.out.println(this.name + "�� hp 1���·� ��Ȱ�մϴ�.");
			hp = 1;
			exp = 0;
		}
	}
	public void Play(){
		hp -= 20;
		exp += 15;
		if(super.UpdateState()){
			System.out.println(this.name + "�� hp 1���·� ��Ȱ�մϴ�.");
			hp = 1;
			exp = 0;
		}
	}
	public void WaterAttack(){
		System.out.println("������ ����");
	}
	public void PrintState(){
		super.PrintState();
	}
}
