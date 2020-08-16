package p0427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	static String path = "src/p0427/files/fileTest.txt";
	public static void main(String[] agrs) throws IOException{
		File file = new File(path);
		if(!file.exists()){
			System.out.println("������ �����մϴ�.");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		int ch;
		String path = file.getPath();
		System.out.println("path : "+path);
		if(file.canWrite()){
			System.out.println("���� ���� ����");
			bw.write("hello \n");
			bw.flush();
		}
		if(file.canRead()){
			System.out.println("�б� ���� ����");
			while((ch = br.read())!=-1){
				System.out.print((char)ch);
			}
		}
		if(file.canExecute()){
			System.out.println("���� ���� ����");
		}
		if(file.isFile()){
			System.out.println("���� �Դϴ�.");
		}
		if(file.isHidden()){
			System.out.println("���� �Ӽ�");
		}
		long size = file.length();
		System.out.println("����ũ�� : "+ size);
		System.out.println(path + "������ �����Ѵ�.");
		file.delete();
		File dir = new File("src/p0427/files");
		if(!dir.exists())
		{
			System.out.println("���丮 ����");
			dir.mkdir();
		}
		String[] fileNames =  dir.list();
		System.out.println("���� ���");
		for(ch = 0 ;ch<fileNames.length;ch++){
			System.out.println(fileNames[ch]);
		}
		br.close();
		bw.close();
	}
}
