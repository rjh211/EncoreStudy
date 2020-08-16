package Pokemon;

public class Squirtle extends Pokemon {
	Squirtle(){
		super();
		hp = 25;
		name = "꼬부기";
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
			System.out.println(this.name + "가 hp 1상태로 부활합니다.");
			hp = 1;
			exp = 0;
		}
	}
	public void Play(){
		hp -= 20;
		exp += 15;
		if(super.UpdateState()){
			System.out.println(this.name + "가 hp 1상태로 부활합니다.");
			hp = 1;
			exp = 0;
		}
	}
	public void WaterAttack(){
		System.out.println("물대포 공격");
	}
	public void PrintState(){
		super.PrintState();
	}
}
