package p0423;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu((Service )new ServiceImplMember((Dao )new DaoImplMember()));
		menu.Run(new Scanner(System.in));
	}

}
