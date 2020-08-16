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
			System.out.println("파일이 없습니다.");
		}
		while(select != 6){
			System.out.println("수행할 기능을 선택하시오.");
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체 출력 6.종료");
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
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못된 번호");
			}
		}
	}
	static void Create(Address[] address){
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<address.length;i++){			
			System.out.println((i+1)+"번째 사람의 이름을 입력하시오 : ");
			String name = sc.next();
			if(i != 0){				
				for(int j =0  ;j<i;j++){
					if(address[j].name.equals(name)){
						i-=1;
						System.out.println("중복된 이름입니다 다시입력하세요.");
						break;
					}
					if(j == i-1){
						address[i] = new Address();
						address[i].name = name;
						System.out.println((i+1)+"번째 사람의 전화번호을 입력하시오 : ");
						address[i].phoneNo = sc.nextInt();
						System.out.println((i+1)+"번째 사람의 주소를 입력하시오 : ");
						address[i].address = sc.next();
					}
				}
			}
			else{
				address[i] = new Address();
				address[i].name = name;
				System.out.println((i+1)+"번째 사람의 전화번호을 입력하시오 : ");
				address[i].phoneNo = sc.nextInt();
				System.out.println((i+1)+"번째 사람의 주소를 입력하시오 : ");
				address[i].address = sc.next();
			}
		}
	}
	static void Search(Address[] addr, String name){
		int i = 0;
		for(i = 0  ;i<addr.length;i++){
			if(addr[i].name.equals(name)){
				System.out.println(addr[i].name + "의  전화번호는  "+ addr[i].phoneNo+"입니다.");
				System.out.println(addr[i].name + "의  주소는  "+ addr[i].address+"입니다.");
				return;
			}
		}
		if(i == addr.length){System.out.println("찾으려는 사람이 없습니다.");}
	}
	static void Modify(Address[] addr){
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 사람의 이름을 입력하시오.");
		String modifyName = sc.next();
		
		for(int i =0 ;i<addr.length;i++){
			if(addr[i].name.equals(modifyName)){
				System.out.println("수정할 번호를 입력하시오.");
				addr[i].phoneNo = sc.nextInt();
				System.out.println("수정할 주소를 입력하시오.");
				addr[i].address = sc.next();
			}
			else{
				System.out.println("이름입력이 잘못되었습니다.");
			}
		}
	}
	static Address[] Delete(Address[] addr){
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사람의 이름을 입력하시오 : ");
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
		System.out.println("일치하는 이름이 없습니다.");
		return addr;
	}
	static void PrintAllUser(Address[] addr){
		for(int i =0 ;i<addr.length;i++){
			System.out.println((i+1)+"번째 사람의 이름 : "+ addr[i].name);
			System.out.println((i+1)+"번째 사람의 번호 : "+ addr[i].phoneNo);
			System.out.println((i+1)+"번째 사람의 주소 : "+ addr[i].address);
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
