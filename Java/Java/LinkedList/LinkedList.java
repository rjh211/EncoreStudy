package LinkedList;


public class LinkedList {
	private Node Head = new Node();
	public LinkedList(){}
	public void Add(int index, Node node){
		Node curNode = this.Head;
		for(int i = 0 ; i<index;i++){
			if(curNode.getNext() == null){
				System.out.println("������ ��忡 �߰��մϴ�.");
				break;
			}
			curNode = curNode.getNext();
		}
		node.setNext(curNode.getNext());
		curNode.setNext(node);
	}
	public void test(){
		System.out.println(this.Head.getPrev());
	}
	public void ShowAll(){
		Node curNode = this.Head;
		while(curNode.getNext() != null){
			curNode = curNode.getNext();
			System.out.println(curNode.getPrev());
		}
	}
	public void delete(int index){
		Node curNode = this.Head;
		for(int i = 0 ; i<index;i++){
			if(curNode.getNext() == null){
				System.out.println("������ ��带 �����մϴ�.");
				break;
			}
			curNode = curNode.getNext();
		}
		curNode.setNext(curNode.getNext().getNext());
	}
	public void select(int index){
		Node curNode = this.Head;
		for(int i = 0 ; i<index;i++){
			if(curNode.getNext() == null){
				System.out.println("������ ��带 ��ȸ�մϴ�.");
				break;
			}
			curNode = curNode.getNext();
		}
		System.out.println(index+"��° ���� "+curNode.getPrev()+"�̴�.");
	}
	public void update(int index, int newValue){
		Node curNode = this.Head;
		for(int i = 0 ; i<index;i++){
			if(curNode.getNext() == null){
				System.out.println("������ ��带 �����մϴ�.");
				break;
			}
			curNode = curNode.getNext();
		}
		curNode.setPrev(newValue);
	}
}
