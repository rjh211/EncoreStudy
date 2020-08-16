package p0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class EchoServerTh extends Thread{
	private Socket socket;
	public EchoServerTh(Socket socket){
		this.socket = socket;
	}
	public void run(){
		String str;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			while(true){
				str = br.readLine();
				System.out.println("Ŭ���̾�Ʈ �޼��� : "+str);
				out.println(str + "\n");
				if(str.startsWith("/stop")){		//'/stop' �Է½� ����
					socket.close();
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class EchoServer {
	public static void main(String[] args){
		try {
			ServerSocket ss = new ServerSocket(3333);
			System.out.println("��������");
			while(true){
				Socket socket = ss.accept();
				System.out.println("Ŭ���̾�Ʈ ����");
				new EchoServerTh(socket).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
