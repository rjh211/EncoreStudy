package Pokemon;

import java.util.Scanner;

public class PokemonMain {
	public static void main(String[] args){
		int select = 0;
		Scanner sc = new Scanner(System.in);

		Pokemon pokemon = null;
		System.out.println("포켓몬을 선택하십시오");
		do{
			System.out.println("1.꼬부기 2.파이리 3.이상해씨");
			select = sc.nextInt();
			if(select == 1){
				pokemon = new Squirtle();		//업캐스팅
			}
			else if(select == 2){
				pokemon = new Charmander();
			}
			else if(select == 3){
				pokemon = new Bulbasaur();
			}
			else{
				System.out.println("올바른 숫자를 입력하시오");
			}
		} while(pokemon == null);
		
		do{
			System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.정보 출력 6.공격 7.종료");
			select = sc.nextInt();
			switch(select){
			case 1:
				pokemon.Eat();		//업캐스팅이 되었지만 자식에서 재정의한 메서드로 동적결합하여 실행된다.
				break;
			case 2:
				pokemon.Sleep();
				break;
			case 3:
				pokemon.Play();
				break;
			case 4:
				pokemon.Excercise();
				break;
			case 5:
				pokemon.PrintState();
				break;
			case 6:
				if(pokemon instanceof Charmander){
					((Charmander) pokemon).FireAttack();
				} else if(pokemon instanceof Squirtle){
					((Squirtle) pokemon).WaterAttack();
				} else if(pokemon instanceof Bulbasaur){
					((Bulbasaur) pokemon).GrassAttack();
				}
				break;
			case 7:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("올바른 숫자를 입력하세요.");
				break;
			}
		}while(select != 7);
	}
}
