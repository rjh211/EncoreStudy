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
		room.sendMsgAll("["+id+"]님이 들어왔습니다.");
		while(true){
			String str;
			try {
				str = br.readLine();
				if(str.startsWith("/stop")){
					sendMsg(str);
					room.delete(this);
					String ip = socket.getInetAddress().getHostName();
					room.sendMsgAll("["+ip+"]님이 나가셨습니다.");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //담ㄷ망 클라이언트의 메세지를 받는다.
//			room.sendMsgAll(str);
		}
	}
	public void sendMsg(String msg){
	out.println(msg);	
	}
}
