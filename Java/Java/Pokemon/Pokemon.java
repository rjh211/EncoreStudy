package Pokemon;

public abstract class Pokemon {
	protected int hp, exp, level;
	protected String name;
	public Pokemon(){
		exp = 0;
		level = 1;
	}
	protected abstract void Eat();
	protected abstract void Sleep();
	protected abstract void Excercise();
	protected abstract void Play();
	protected void PrintState(){
		System.out.println("이름 : "+ name +"\thp : "+ hp +"경험치 : "+ exp +"\t레벨 : "+ level);
	}
	protected boolean UpdateState(){		
		if(this.hp <= 0){
			System.out.println("캐릭터가 사망하였습니다.");
			return true;
		}
		if(this.exp >= 20){
			exp -= 20;
			level += 1;
		}
		return false;
	}
}
