package p0427;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Test implements Serializable{
	private String name;
	private int age;
	public Test(){}
	public Test(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SerializeTest [name=" + name + ", age=" + age + "]";
	}
}
public class SerializeTest {
	
	public static void main(String[] args){
		FileOutputStream fo;
		try {
			Test t = new Test("AAA",12);
			Test t2;
			fo = new FileOutputStream("src/p0427/files/d.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			FileInputStream fi = new FileInputStream("src/p0427/files/d.dat");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			oo.writeObject(t);
			oo.close();
			fo.close();
			
			t2 = (Test) oi.readObject();
			oi.close();
			fi.close();
			
			System.out.println(t2);
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
	}
}
