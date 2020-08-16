package LinkedList;


public class LinkedList {
	private Node Head = new Node();
	public LinkedList(){}
	public void Add(int index, Node node){
		Node curNode = this.Head;
		for(int i = 0 ; i<index;i++){
			if(curNode.getNext() == null){
				System.out.println("마지막 노드에 추가합니다.");
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
				System.out.println("마지막 노드를 삭제합니다.");
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
				System.out.println("마지막 노드를 조회합니다.");
				break;
			}
			curNode = curNode.getNext();
		}
		System.out.println(index+"번째 값은 "+curNode.getPrev()+"이다.");
	}
	public void update(int index, int newValue){
		Node curNode = this.Head;
		for(int i = 0 ; i<index;i++){
			if(curNode.getNext() == null){
				System.out.println("마지막 노드를 변경합니다.");
				break;
			}
			curNode = curNode.getNext();
		}
		curNode.setPrev(newValue);
	}
}
