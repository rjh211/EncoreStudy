package HomeWork.Memo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServiceImpl implements Service {
	private String path;
	private File dir;
	private boolean cont;

	ServiceImpl() {
		this.path = "src/HomeWork/Memo/";
		this.dir = new File(this.path);
	}

	@Override
	public boolean mkDir() {
		// TODO Auto-generated method stub
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("���丮�� �����Ǿ����ϴ�.");
			return true;
		} else {
			System.out.println("���� ����");
			return false;
		}
	}

	@Override
	public String mkFileName(Scanner sc) {
		// TODO Auto-generated method stub
		String[] files = dir.list();
		String fName = "";
		int i = 0;
		do {
			System.out.println("���� �� : ");
			fName = sc.next();
			for (i = 0; i < files.length; i++) {
				if (files[i].equals(fName)) {
					System.out.println("�ߺ��� ���ϸ�(1.���ϸ� �ٽ��Է� 2.�̾��");
					int m = sc.nextInt();
					if (m == 1) {
						break;
					} else {
						cont = true;
						return fName;
					}
				}
			}
			if (i == files.length) {
				return fName;
			}
		} while (true);
	}

	@Override
	public void Read(Scanner sc) {
		// TODO Auto-generated method stub
		String[] files = dir.list();
		int i;
		for (i = 0; i < files.length; i++) {
			System.out.println(i + ". " + files[i]);
		}
		int select = -1;
		do {
			System.out.println("���� ���Ϲ�ȣ ����: ");
			select = sc.nextInt();
		} while (i < 0 || i >= files.length);
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + files[i]));
			while ((i = br.read()) != -1) {
				System.out.println((char) i);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void Write(Scanner sc) {
		// TODO Auto-generated method stub
		String fName = mkFileName(sc);
		String str = "";
		try {
			System.out.println("������ �Է��Ͻÿ�.");
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + fName, cont)); // 2��°
																						// param��
																						// �̾��
																						// ����
			cont = false;
			System.out.println("������ �Է��Ͻÿ�. �Է��� ���߷��� /stop�� �Է��Ͻÿ�.");
			while (!str.startsWith("/stop")) {
				sc.next();
				str = sc.nextLine();
				bw.write(str + "\n");
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(Scanner sc) {
		// TODO Auto-generated method stub
		String[] files = dir.list();
	}
}
