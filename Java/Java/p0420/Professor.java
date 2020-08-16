package p0420;


public class Professor extends Person {
	private Subject subject;
	public Professor(){}
	public Professor(PersonType pt, String num, String name, String dept, String tel, Subject s){
		this.setType(pt);
		this.setNumber(num);
		this.setName(name);
		this.setDept(dept);
		this.setTel(tel);
		subject = s;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void 개설(){
		System.out.println("과목 개설");
	}
	@Override
	public String toString() {
		return "Professor [subject=" + subject + ", number=" + number + ", type=" + type.getTypename() + ", name=" + name + ", dept="
				+ dept + ", tel=" + tel + "]";
	}
	
}
