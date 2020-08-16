package p0428.Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClientTh extends Thread{
	private Socket socket;
	private BufferedReader br;
	
	public ClientTh(Socket socket){
		this.socket = socket;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		while(true){
			try {
				String msg = br.readLine();
				System.out.println(msg);
				if(msg.startsWith("/stop")){
					socket.close();
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket("192.168.137.47",9999);
			ClientTh th = new ClientTh(socket);
			th.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String str = "";
			while(true){
				System.out.println("msg:");
				str = sc.next();
				out.println(str);
				out.flush();
				if(br.readLine() == null){
					System.out.println("null");
				}
				str = br.readLine();
				System.out.println(str);
				if(str.startsWith("/stop")){
					socket.close();
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
