package p0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
	//Socket socket = new Socket("192.168.22.56",3333);
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(System.in);
			Socket socket = new Socket("localhost",3333);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("hello server");
			String str = "";
			while(true){
				System.out.println("msg:");
				str = sc.next();
				out.println(str);
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
