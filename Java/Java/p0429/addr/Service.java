package p0429.addr;

import java.util.Scanner;

public interface Service {
	void addMember(Scanner sc);
	void getMember(Scanner sc);
	void getByName(Scanner sc);
	void getAll();
	void editMember(Scanner sc);
	void delMember(Scanner sc);
}
