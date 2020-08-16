package p0427;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream os = new FileOutputStream("src/p0427/files/b.txt");
			int ch;
			while((ch = System.in.read()) != '\n'){
				System.out.print((char) ch);
				os.write(ch);
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
