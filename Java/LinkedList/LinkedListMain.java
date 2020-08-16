package LinkedList;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int index = 0;
		do{
			System.out.println("1.추가 2.전체 출력 3.삭제 4.조회 5.변경 9.test 0.종료");
			select = sc.nextInt();
			switch(select){
			case 1:
				System.out.println("input index num : ");
				index = sc.nextInt();
				System.out.println("input Value");
				int value = sc.nextInt();
				linkedList.Add(index, new Node(value,null));
				break;
			case 2:
				linkedList.ShowAll();
				break;
			case 3:
				System.out.println("input index num : ");
				index = sc.nextInt();
				linkedList.delete(index);
				break;
			case 4:
				System.out.println("input index num : ");
				index = sc.nextInt();
				linkedList.select(index);
				break;
			case 5:
				System.out.println("input index num : ");
				index = sc.nextInt();
				System.out.println("input New Value");
				int newValue = sc.nextInt();				
				linkedList.update(index,newValue);
				break;
			case 9:
				linkedList.test();
				break;
			case 0:
				System.out.println("종료 합니다.");
				return;
			}
		}while(select != 0);
	}

}
