package p0413;

import java.util.Scanner;

class Member {
	String name;
	int number;

	Member() {

	}

	Member(String name, int number) {
		this.name = name;
		this.number = number;
	}
}

public class Dao {
	Member[] datas = new Member[10];
	Scanner sc = new Scanner(System.in);
	int cnt;

	void Insert(Member m) {
		datas[cnt] = m;
		cnt++;
	}

	int GetIdx(String name) {
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] != null) {
				if (datas[i].name.equals(name)) {
					return i;
				}
			}
		}
		return -1;
	}

	Member Select(String name) {
		int index = GetIdx(name);
		if (index < 0)
			return null;
		return datas[index];

	}

	void Update(Member m) {
		int index = GetIdx(m.name);
		if (index < 0) {
			System.out.println("없는 이름");
			return;
		}
		datas[index].name = m.name;
		datas[index].number = m.number;
	}

	void Delete(String name) {
		int index = GetIdx(name);
		if (index < 0) {
			System.out.println("없는 이름");
			return;
		}
		for (int i = index; i < datas.length; i++) {
			datas[i] = datas[i + 1];
		}
		cnt--;
	}

	void PrintAll() {
		for (int i = 0; i < datas.length; i++) {
			System.out.println((i + 1) + "번째 이름 : " + datas[i].name);
			System.out.println((i + 1) + "번째 번호 : " + datas[i].number);
		}
	}
}
