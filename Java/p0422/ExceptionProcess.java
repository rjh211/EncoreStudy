package p0422;

public class ExceptionProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �߻���");
		try{			
			int x = 3/0;
		} catch(ArithmeticException e){		//try���� ���� ���� ��ü�� ���� (������ ��ġ�ϴ� ���ܸ� ����)
			e.printStackTrace();
			System.out.println("0���� �����������ϴ�.");
		} catch(NullPointerException e){
			e.printStackTrace();
		} finally{
			System.out.println("���ܰ� ���� �ȳ��� ��µ�");
		}
		System.out.println("��¾ȵ�");
	}

}
