package HomeWork2;

import java.util.Scanner;

public interface Service {
	void adddProduct(Scanner sc);
	void PrintProduct(Scanner sc);	//��ǰ ��ȣ �˻��Ͽ� ��ǰ ���
	void PrintAll();				//��ü �˻��� ��� ���
	void getByName(Scanner sc);		//�̸����� �˻��Ͽ� ��� ���
	void editPrice(Scanner sc);		//��ǰ��ȣ, ������ �Է¹޾Ƽ� ����
	void in(Scanner sc);
	void out(Scanner sc, Order[] or);
	void delProduct(Scanner sc);	//��ǰ��ȣ �Է¹޾� ����
	Product getByNum(int num);	//�ֹ��ʿ�
	Product[] getAll();
}
