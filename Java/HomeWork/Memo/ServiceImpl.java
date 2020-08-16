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
			System.out.println("디렉토리가 생성되었습니다.");
			return true;
		} else {
			System.out.println("생성 실패");
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
			System.out.println("파일 명 : ");
			fName = sc.next();
			for (i = 0; i < files.length; i++) {
				if (files[i].equals(fName)) {
					System.out.println("중복된 파일명(1.파일명 다시입력 2.이어쓰기");
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
			System.out.println("읽을 파일번호 선택: ");
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
			System.out.println("내용을 입력하시오.");
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + fName, cont)); // 2번째
																						// param은
																						// 이어쓰기
																						// 여부
			cont = false;
			System.out.println("내용을 입력하시오. 입력을 멈추려면 /stop을 입력하시오.");
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
