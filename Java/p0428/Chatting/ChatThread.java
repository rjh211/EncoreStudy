package p0428.Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThread extends Thread{
	private Socket socket;
	private PrintWriter out;
	private BufferedReader br;
	private ChatRoom room;
	public ChatThread(Socket socket, ChatRoom room){
		super();
		this.socket = socket;
		this.room = room;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		super.run();
		String id = socket.getInetAddress().getHostName();
		room.sendMsgAll("["+id+"]���� ���Խ��ϴ�.");
		while(true){
			String str;
			try {
				str = br.readLine();
				if(str.startsWith("/stop")){
					sendMsg(str);
					room.delete(this);
					String ip = socket.getInetAddress().getHostName();
					room.sendMsgAll("["+ip+"]���� �����̽��ϴ�.");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //�㤧�� Ŭ���̾�Ʈ�� �޼����� �޴´�.
//			room.sendMsgAll(str);
		}
	}
	public void sendMsg(String msg){
	out.println(msg);	
	}
}
