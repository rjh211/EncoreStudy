package HomeWork.Memo;

import java.util.Scanner;

public interface Service {
	public boolean mkDir();
	public String mkFileName(Scanner sc);
	public void Read(Scanner sc);
	public void Write(Scanner sc);
	public void Delete(Scanner sc);
}
