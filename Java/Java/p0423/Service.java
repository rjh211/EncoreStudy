package p0423;

import java.util.Scanner;

public interface Service {
	void AddMember(Scanner sc);	//등록
	void GetMember(Scanner sc);	//검색
	void GetAll();				//출력
	void EditMember(Scanner sc);//수정
	void DelMember(Scanner sc);	//삭제
}
