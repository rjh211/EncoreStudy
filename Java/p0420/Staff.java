package p0420;


public class Staff extends Person {
	private Subject job;
	public Staff(){}
	public Staff(PersonType pt, String num, String name, String dept, String tel, Subject job){
		this.setType(pt);
		this.setNumber(num);
		this.setName(name);
		this.setDept(dept);
		this.setTel(tel);
		this.job = job;
	}
	public Subject getSubject() {
		return job;
	}
	public void setSubject(Subject job) {
		this.job.setSubCode(job.getSubCode());
		this.job.setSubName(job.getSubName());
	}
	public void 업무(){
		System.out.println("업무 수행");
	}
	@Override
	public String toString() {
		return "Professor [job=" + job + ", number=" + number + ", type=" + type.getTypename() + ", name=" + name + ", dept="
				+ dept + ", tel=" + tel + "]";
	}
	
}
