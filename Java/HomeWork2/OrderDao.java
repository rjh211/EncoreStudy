package HomeWork2;

public interface OrderDao {
	void insert(Order o);		//�ֹ����
	int GetIdxByNum(int num);		//�ֹ���ȣ�� �˻��Ͽ� �迭��ġ ��ȯ
	Order Select(int num);		//�ֹ���ȣ�� �˻��Ͽ� �ֹ���ü ��ȯ
	Order[] SelectAll();		//����ü �˻��Ͽ� ��ȯ
	void del(int num);			//�ֹ���ȣ�� �ֹ�����(���)
	Order[] SelectByPayFalse();//���� ��� ���
	Order[] SelectByOut(); // ����� ���
	void UpdateFlag(int num, int type, boolean flag);//
}
