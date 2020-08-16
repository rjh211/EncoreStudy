package p0423.address;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl implements Service {
	private Dao dao;

	public ServiceImpl(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.println("<�� ��� ���>");
		System.out.print("name:");
		m.setName(sc.next());
		System.out.print("tel:");
		m.setTel(sc.next());
		System.out.print("address:");
		m.setAddress(sc.next());
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("<�˻�>");
		System.out.print("search name:");
		String name = sc.next();
		Member m = dao.select(name);
		if (m == null) {
			System.out.println("��ϵ��� ���� ���");
		} else {
			System.out.println(m);
		}
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println("<��ü���>");
		ArrayList<Member> al = dao.selectAll();
		for (Member m : al) {
			System.out.println(m);
		}
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("<����>");
		Member m = new Member();
		System.out.print("name:");
		m.setName(sc.next());
		Member m2 = dao.select(m.getName());
		if (m2 == null) {
			System.out.println("��ϵ��� ���� ���. �������");
			return;
		}
		System.out.println(m.getName() + "�� ���� �� ����");
		System.out.println(m2);
		System.out.print("new tel:");
		m.setTel(sc.next());
		System.out.print("new address:");
		m.setAddress(sc.next());
		dao.update(m);
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("<����>");
		System.out.print("del name:");
		String name = sc.next();
		dao.delete(name);
	}

	@Override
	public void FileSave() {
		// TODO Auto-generated method stub
		// ArrayList�� ��� ��ü�� ���Ͽ� ����
		// ���:src/p0423/address/data.dat
		ArrayList<Member> list = dao.selectAll();
		try {
			ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("src/p0423/address/data.dat"));
			for (Member m : list) {
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
	public void FileLoad() {
		// TODO Auto-generated method stub
		// ���Ͽ��� ���� ��� ��ü�� ArrayList�� ��´�.
		// ���:src/p0423/address/data.dat
		try {
			FileInputStream fi = new FileInputStream("src/p0423/address/data.dat");
			ObjectInputStream oi = new ObjectInputStream(fi);

			while (fi.available() > 0) {
				Member m = (Member) oi.readObject();
				dao.insert(m);
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

}
