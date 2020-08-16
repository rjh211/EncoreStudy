package p0429.addr;

public class Menu {
	private Service service = null;
	public Menu(){
		this.service = new ServiceImple();
	}
	public void run(Scanner sc){
		boolean flag = true;
		String str = "1.등록 2. 번호로검색 3. 이름으로 검색 4. 수정 5. 삭제 6. 목록 7.종료";
		
	}
}
