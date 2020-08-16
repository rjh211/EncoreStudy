package Pokemon;

public class Charmander extends Pokemon {
	public Charmander(){
		super();
		hp = 20;
		name = "���̸�";
	}
	public void Eat(){
		hp += 6;
	}
	public void Sleep(){
		hp += 12;
	}
	public void Excercise(){
		hp -= 10;
		exp += 12;
		if(super.UpdateState()){
			System.out.println(this.name + "�� hp 1���·� ��Ȱ�մϴ�.");
			hp = 1;
			exp = 0;
		}
	}
	public void Play(){
		hp -= 20;
		exp += 17;
		if(super.UpdateState()){
			System.out.println(this.name + "�� hp 1���·� ��Ȱ�մϴ�.");
			hp = 1;
			exp = 0;
		}
	}
	public void FireAttack(){
		System.out.println("�Ұ���");
	}
	public void PrintState(){
		super.PrintState();
	}
}
