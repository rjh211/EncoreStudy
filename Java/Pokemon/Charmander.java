package Pokemon;

public class Charmander extends Pokemon {
	public Charmander(){
		super();
		hp = 20;
		name = "파이리";
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
			System.out.println(this.name + "가 hp 1상태로 부활합니다.");
			hp = 1;
			exp = 0;
		}
	}
	public void Play(){
		hp -= 20;
		exp += 17;
		if(super.UpdateState()){
			System.out.println(this.name + "가 hp 1상태로 부활합니다.");
			hp = 1;
			exp = 0;
		}
	}
	public void FireAttack(){
		System.out.println("불공격");
	}
	public void PrintState(){
		super.PrintState();
	}
}
