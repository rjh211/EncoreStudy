package LinkedList;

public class Node {
	private Object prev;
	private Node next;
	public Node(){}
	public Node(Object prev, Node next){this.prev = prev; this.next = next;}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
