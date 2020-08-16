package HomeWork.Memo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class MemoServiceImpl implements MemoService {
	MemoDao mDao = new MemoDaoImpl();
	@Override
	public void AddMemo(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Title��  �Է��Ͻÿ�");
		String title = sc.next();
		System.out.println("������ �Է��Ͻÿ�.");
		String story = sc.next();
		
		mDao.insert(new Memo(title, story));
	}

	@Override
	public void SelectMemo(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("������ Title�� �Է��Ͻÿ�.");
		String title = sc.next();
		Memo memo = mDao.select(title);
		memo.toString();
	}

	@Override
	public void DelMemo(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("������ Title�� �Է��Ͻÿ�.");
		String title = sc.next();
		
		mDao.delete(title);
	}

	@Override
	public void UpdateMemo(Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void GetAll() {
		// TODO Auto-generated method stub
		for(Memo m : mDao.selectAll()){
			m.toString();
		}
	}

	@Override
	public void FileLoad(Scanner sc) {
		// TODO Auto-generated method stub
		try {
			System.out.println("�о�� ���ϸ��� �Է��ϼ���.");
			String fileName = sc.next();
			FileInputStream fi = null;
			ObjectInputStream oi = null;
			if(new File("src/HomeWork/Memo/"+fileName+".txt").exists()){
				fi = new FileInputStream("src/HomeWork/Memo/"+fileName+".txt");
				oi = new ObjectInputStream(fi);
			} else{
				System.out.println("�̸� �Է¿���");
				return;
			}
			

			while (fi.available() > 0) {
				Memo m = (Memo) oi.readObject();
				mDao.insert(m);
			}
			oi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if (e instanceof EOFException) {
				System.out.println("���� �����Ͱ� ����.");
			} else {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void FileSave(Scanner sc) {
		// TODO Auto-generated method stub
		ArrayList<Memo> list = mDao.selectAll();
		System.out.println("���ϸ��� �Է��ϼ���.");
		String fileName = sc.next();
		try {
			ObjectOutputStream oo= null;
			if(new File("src/HomeWork/Memo/"+fileName+".txt").exists()){
				oo = new ObjectOutputStream(new FileOutputStream("src/HomeWork/Memo/"+fileName+".txt"));
			} else{
				System.out.println("�̸� �Է¿���");
				return;
			}
			for (Memo m : list) {
				oo.writeObject(m);
			}
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void GetFileList() {
		// TODO Auto-generated method stub
		int ch;
		File dir = new File("src/p0427/files");
		String[] fileNames =  dir.list();
		System.out.println("���� ���");
		for(ch = 0 ;ch<fileNames.length;ch++){
			System.out.println(fileNames[ch]);
		}
	}
	
	
}
