package p0420;



public class Main {
	public static void main(String[] args){
		//Staff s = new Staff(new PersonType(1,"교직원"), "s_2","교직원a","인사과","1111",new Subject(3,"인사관리"));
		Staff x = new Staff(new PersonType(2,"aaaa"),"a","a","a","a",new Subject(1,"f"));
		Student st = new Student(new PersonType(2,"학생"), "s_1","학생b","컴퓨터공학과","1234",new Subject(1,"전산학 개론"));
		Professor p = new Professor(new PersonType(1,"교수"),"p_1","교수c","컴퓨터공학과","7777",new Subject(2, "운영체제론"));
		
		System.out.println(x);
		x.업무();
		System.out.println(st);
		st.수강();
		System.out.println(p);
		p.개설();
	}
}
