package Pokemon;

import java.util.Scanner;

public class PokemonMain {
	public static void main(String[] args){
		int select = 0;
		Scanner sc = new Scanner(System.in);

		Pokemon pokemon = null;
		System.out.println("���ϸ��� �����Ͻʽÿ�");
		do{
			System.out.println("1.���α� 2.���̸� 3.�̻��ؾ�");
			select = sc.nextInt();
			if(select == 1){
				pokemon = new Squirtle();		//��ĳ����
			}
			else if(select == 2){
				pokemon = new Charmander();
			}
			else if(select == 3){
				pokemon = new Bulbasaur();
			}
			else{
				System.out.println("�ùٸ� ���ڸ� �Է��Ͻÿ�");
			}
		} while(pokemon == null);
		
		do{
			System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.���� ��� 6.���� 7.����");
			select = sc.nextInt();
			switch(select){
			case 1:
				pokemon.Eat();		//��ĳ������ �Ǿ����� �ڽĿ��� �������� �޼���� ���������Ͽ� ����ȴ�.
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
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
				break;
			}
		}while(select != 7);
	}
}
