package p0408;

public class Copy {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b;
		b = a; // ���� ���� ���� �ϳ��� ���� �ٲ�� ���� ���̹ٲ�; => �ּҰ��� ����
		b[1] = 200;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		int[] c = new int[a.length]; // deep copy
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i];
		}
		
		c[1] = 500;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		int[] d = a.clone(); // Clone API ���
		int[] e = new int[a.length];
		System.arraycopy(a, 0, e, 0, 3);	//arraycopy API ���
		
		d[1] = 600;
		e[1] = 700;
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
