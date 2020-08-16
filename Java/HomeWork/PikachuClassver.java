package HomeWork;

import java.util.Scanner;

class Pikachu{
	int hp, exp, level;
	Pikachu(){
		this.hp = 30;
		this.exp = 0;
		this.level = 1;
	}
	void Eat(){
		this.hp += 5;
	}
	void Sleep(){
		this.hp += 10;
	}
	void Play(){
		this.hp -= 8;
		this.exp += 10;
		if(this.exp >= 20) levelup();
		if(this.hp <= 0) {
			System.out.println("ĳ���Ͱ� ����Ͽ����ϴ�. \n �ɸ��Ͱ� �ʱ�ȭ �˴ϴ�.");
			Death();
		}
	}
	void Excercise(){
		this.hp -= 10;
		this.exp += 15;
		if(this.exp >= 20) levelup();
		if(this.hp <= 0) {
			System.out.println("ĳ���Ͱ� ����Ͽ����ϴ�. \n �ɸ��Ͱ� �ʱ�ȭ �˴ϴ�.");
			Death();
		}
	}
	void PrintInform(){
		System.out.println("hp : \t"+this.hp);
		System.out.println("exp : \t"+this.exp);
		System.out.println("level : \t"+this.level);
	}
	private void levelup(){
		this.exp -= 20;
		this.level += 1;
	}
	private void Death(){
		this.hp = 30;
		this.exp = 0;
		this.level = 1;
	}
}
public class PikachuClassver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		Scanner sc = new Scanner(System.in);
		Pikachu pikachu = new Pikachu();
		do{			
			System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.��������");
			select = sc.nextInt();
			switch(select){
			case 1:
				pikachu.Eat();
				break;
			case 2:
				pikachu.Sleep();
				break;
			case 3:
				pikachu.Play();
				break;
			case 4:
				pikachu.Excercise();
				break;
			case 5:
				pikachu.PrintInform();
				break;
			case 6:
				System.out.println("������ �����մϴ�.");
				return;
			default:
				System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			}
		}while(select != 6);
		
	}

}
