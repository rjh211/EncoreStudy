package p0420;



public class Main {
	public static void main(String[] args){
		//Staff s = new Staff(new PersonType(1,"������"), "s_2","������a","�λ��","1111",new Subject(3,"�λ����"));
		Staff x = new Staff(new PersonType(2,"aaaa"),"a","a","a","a",new Subject(1,"f"));
		Student st = new Student(new PersonType(2,"�л�"), "s_1","�л�b","��ǻ�Ͱ��а�","1234",new Subject(1,"������ ����"));
		Professor p = new Professor(new PersonType(1,"����"),"p_1","����c","��ǻ�Ͱ��а�","7777",new Subject(2, "�ü����"));
		
		System.out.println(x);
		x.����();
		System.out.println(st);
		st.����();
		System.out.println(p);
		p.����();
	}
}
