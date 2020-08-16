package p0428.Chatting;

import java.util.Vector;

public class ChatRoom {
	private Vector<ChatThread> members;
	
	public ChatRoom(){
		members = new Vector<ChatThread>();
	}
	public void addMember(ChatThread ch){
		members.add(ch);
	}
	public void delete(ChatThread ch){
		members.remove(ch);
	}
	public void sendMsgAll(String msg){
		for(ChatThread ch : members){
			ch.sendMsg(msg);
		}
	}
}
