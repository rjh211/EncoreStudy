package p0423.address;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new DaoImpl();
		Service service = new ServiceImpl(dao);
		Menu m = new Menu(service);
		m.run(new Scanner(System.in));
	}

}
