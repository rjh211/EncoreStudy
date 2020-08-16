package p0427;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWirteRead {
	public static void main(String[] args){
		String path = "src/p0427/files/c.txt";
		try {
			FileWriter fw = new FileWriter(path);
			FileReader fr = new FileReader("src/p0427/files/b.txt");
			
			BufferedWriter bw = new BufferedWriter(path);
			int ch;
			while((ch = fr.read()) != -1){
				fw.write(ch);
			}
			fw.close();
			fr.close();
			System.out.println("º¹»ç³¡");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
