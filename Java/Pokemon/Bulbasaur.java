package Pokemon;

public class Bulbasaur extends Pokemon {
	Bulbasaur(){
		super();
		hp = 40;
		name = "�̻��ؾ�"
;	}
	public void Eat(){
		hp += 8;
	}
	public void Sleep(){
		hp += 13;
	}
	public void Excercise(){
		hp -= 10;
		exp += 8;
		if(super.UpdateState()){
			System.out.println(this.name + "�� hp 1���·� ��Ȱ�մϴ�.");
			hp = 1;
			exp = 0;
		}
	}
	public void Play(){
		hp -= 19;
		exp += 13;
		if(super.UpdateState()){
			System.out.println(this.name + "�� hp 1���·� ��Ȱ�մϴ�.");
			hp = 1;
			exp = 0;
		}
	}
	public void GrassAttack(){
		System.out.println("Ǯ ����");
	}
	public void PrintState(){
		super.PrintState();
	}
}
