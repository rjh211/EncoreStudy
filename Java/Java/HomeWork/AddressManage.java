package HomeWork;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



class Address{
	Scanner sc = new Scanner(System.in);
	int phoneNo;
	String name, address;
}

public class AddressManage {
	static String savePath = "src/p0427/files/addr1.dat";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Address[] address = new Address[5];
		int select = 10;
		if(new File(savePath).exists()){
			address = ReadFile();
		} else{
			System.out.println("������ �����ϴ�.");
		}
		while(select != 6){
			System.out.println("������ ����� �����Ͻÿ�.");
			System.out.println("1.��� 2.�˻� 3.���� 4.���� 5.��ü ��� 6.����");
			select = sc.nextInt();
			switch(select){
			case 1:
				Create(address);
				break;
			case 2:
				Search(address,"aaa");
				break;
			case 3:
				Modify(address);
				break;
			case 4:
				Delete(address);
				break;
			case 5:
				PrintAllUser(address);
				break;
			case 6:
				WriteFile(address);
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸��� ��ȣ");
			}
		}
	}
	static void Create(Address[] address){
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<address.length;i++){			
			System.out.println((i+1)+"��° ����� �̸��� �Է��Ͻÿ� : ");
			String name = sc.next();
			if(i != 0){				
				for(int j =0  ;j<i;j++){
					if(address[j].name.equals(name)){
						i-=1;
						System.out.println("�ߺ��� �̸��Դϴ� �ٽ��Է��ϼ���.");
						break;
					}
					if(j == i-1){
						address[i] = new Address();
						address[i].name = name;
						System.out.println((i+1)+"��° ����� ��ȭ��ȣ�� �Է��Ͻÿ� : ");
						address[i].phoneNo = sc.nextInt();
						System.out.println((i+1)+"��° ����� �ּҸ� �Է��Ͻÿ� : ");
						address[i].address = sc.next();
					}
				}
			}
			else{
				address[i] = new Address();
				address[i].name = name;
				System.out.println((i+1)+"��° ����� ��ȭ��ȣ�� �Է��Ͻÿ� : ");
				address[i].phoneNo = sc.nextInt();
				System.out.println((i+1)+"��° ����� �ּҸ� �Է��Ͻÿ� : ");
				address[i].address = sc.next();
			}
		}
	}
	static void Search(Address[] addr, String name){
		int i = 0;
		for(i = 0  ;i<addr.length;i++){
			if(addr[i].name.equals(name)){
				System.out.println(addr[i].name + "��  ��ȭ��ȣ��  "+ addr[i].phoneNo+"�Դϴ�.");
				System.out.println(addr[i].name + "��  �ּҴ�  "+ addr[i].address+"�Դϴ�.");
				return;
			}
		}
		if(i == addr.length){System.out.println("ã������ ����� �����ϴ�.");}
	}
	static void Modify(Address[] addr){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �̸��� �Է��Ͻÿ�.");
		String modifyName = sc.next();
		
		for(int i =0 ;i<addr.length;i++){
			if(addr[i].name.equals(modifyName)){
				System.out.println("������ ��ȣ�� �Է��Ͻÿ�.");
				addr[i].phoneNo = sc.nextInt();
				System.out.println("������ �ּҸ� �Է��Ͻÿ�.");
				addr[i].address = sc.next();
			}
			else{
				System.out.println("�̸��Է��� �߸��Ǿ����ϴ�.");
			}
		}
	}
	static Address[] Delete(Address[] addr){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �̸��� �Է��Ͻÿ� : ");
		String delName = sc.next();
		Address[] newAddress = new Address[addr.length-1];
		int findIndex = 999;
		for(int i =0 ;i<addr.length;i++){
			if(addr[i].name.equals(delName)){
				findIndex = i;
			}
		}
		if(findIndex != 999){
			for(int i =0 ;i<newAddress.length;i++){
				newAddress[i] = new Address();
			}
			for(int j = 0;j<findIndex;j++){
				newAddress[j] = addr[j];
			}
			for(int j = findIndex+1;j<addr.length;j++){
				newAddress[j-1] = addr[j]; 
			}
			return newAddress;
		}
		System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
		return addr;
	}
	static void PrintAllUser(Address[] addr){
		for(int i =0 ;i<addr.length;i++){
			System.out.println((i+1)+"��° ����� �̸� : "+ addr[i].name);
			System.out.println((i+1)+"��° ����� ��ȣ : "+ addr[i].phoneNo);
			System.out.println((i+1)+"��° ����� �ּ� : "+ addr[i].address);
		}
	}
	static Address[] ReadFile(){
		Address[] t2 = new Address[5];
		try {
			int count = 0;
			FileInputStream fi = new FileInputStream(savePath);
			ObjectInputStream oi = new ObjectInputStream(fi);
			while(fi.available() > 0){
				Address a = (Address) oi.readObject();
				t2[count] = a;
				count++;
			}
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t2;
	}
	static void WriteFile(Address[] addr){
		FileOutputStream fo;
		try {
			fo = new FileOutputStream(savePath);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			for(Address add : addr){				
				oo.writeObject(add);
			}
			oo.close();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
