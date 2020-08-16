package p0427;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int ch;
			byte[] arr = new byte[5];
			FileInputStream fi = new FileInputStream("src/p0427/files/a.txt");
			while((ch = fi.read()) != -1){
				System.out.println((char)ch);
			}
			fi.close();
			

			fi = new FileInputStream("src/p0427/files/a.txt");
			while((ch = fi.read(arr)) != -1){
				System.out.println(new String(arr));
			}
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
