package p0407;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hp = 30;
		int exp = 0;
		int level = 1; // exp 20 이되면 레벨업
		// 밥먹기 : hp 5증가
		// 잠자기 : hp 10증가
		// 놀기 : hp 8감소, exp 10증가
		// 운동하기 : hp 15감소, exp 15증가
		System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동 5.상태보기 6.게임 종료");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		while (hp > 0 && choice != 6) {
			switch (choice) {
			case 1: // 밥먹기
				hp += 5;
				System.out.println("hp 5증가");
				break;
			case 2: // 잠자기
				hp += 10;
				System.out.println("hp 10증가");
				break;
			case 3: // 놀기
				hp -= 8;
				exp += 10;
				System.out.println("hp 8감소");
				System.out.println("exp 10증가");
				if (exp >= 20) {
					exp -= 20;
					level += 1;
					System.out.println("level up");
				}
				if (hp <= 0) {
					System.out.println("캐릭터 사망 게임종료");
				}
				break;
			case 4: // 운동하기
				hp -= 15;
				exp += 15;
				System.out.println("hp 15감소");
				System.out.println("exp 15증가");
				if (exp >= 20) {
					exp -= 20;
					level += 1;
					System.out.println("level up");
				}
				if (hp <= 0) {
					System.out.println("캐릭터 사망 게임종료");
				}
				break;
			case 5: // 상태 확인하기
				System.out.println("hp : " + hp);
				System.out.println("exp : " + exp);
				System.out.println("level : " + level);
				break;
			default:
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
			System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동 5.상태보기 6.게임 종료");
			choice = sc.nextInt();
			if (choice == 6) {
				System.out.println("게임을 종료합니다.");
			}
		}
	}

}
