package p0420;
class Subject{
	private int subCode;
	private String subName;
	public Subject(int subCode, String subName){
		this.subCode = subCode;
		this.subName = subName;
	}
	public int getSubCode() {
		return subCode;
	}
	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + "]";
	}
}
public class Student extends Person {
	private Subject subject;
	public Student(){}
	public Student(PersonType pt, String num, String name, String dept, String tel, Subject s){
		this.setType(pt);
		this.setNumber(num);
		this.setName(name);
		this.setDept(dept);
		this.setTel(tel);
		subject = s;
	}
	@Override
	public String toString() {
		return "Student [subject=" + subject + ", number=" + number + ", type=" + type.getTypename() + ", name=" + name + ", dept="
				+ dept + ", tel=" + tel + "]";
	}

	public void 수강(){
		System.out.println("수강신청");
	}
}
