package HomeWork.Memo;

import java.util.Scanner;

public interface MemoService {
	void AddMemo(Scanner sc);
	
	void SelectMemo(Scanner sc);
	
	void DelMemo(Scanner sc);
	
	void UpdateMemo(Scanner sc);
	
	void GetAll();
	
	void FileLoad(Scanner sc);
	
	void FileSave(Scanner sc);
	
	void GetFileList();
}
