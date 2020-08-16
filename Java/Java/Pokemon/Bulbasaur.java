package Pokemon;

public class Bulbasaur extends Pokemon {
	Bulbasaur(){
		super();
		hp = 40;
		name = "이상해씨"
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
			System.out.println(this.name + "가 hp 1상태로 부활합니다.");
			hp = 1;
			exp = 0;
		}
	}
	public void Play(){
		hp -= 19;
		exp += 13;
		if(super.UpdateState()){
			System.out.println(this.name + "가 hp 1상태로 부활합니다.");
			hp = 1;
			exp = 0;
		}
	}
	public void GrassAttack(){
		System.out.println("풀 공격");
	}
	public void PrintState(){
		super.PrintState();
	}
}
