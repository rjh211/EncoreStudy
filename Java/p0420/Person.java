package p0420;

public class Person {
	protected String number;
	protected PersonType type;
	protected String name;
	protected String dept;
	protected String tel;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public PersonType getType() {
		return type;
	}
	public void setType(PersonType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + ", type=" + type + ", name=" + name + ", dept=" + dept + ", tel=" + tel
				+ "]";
	}
	
}
class PersonType{	// 1.학생 2.교수 3.교직원
	private int typeNum;
	private String typename;
	public PersonType(int typeNum, String typeName){
		this.typeNum = typeNum;
		this.typename = typeName;
	}
	public int getTypeNum() {
		return typeNum;
	}
	public void setTypeNum(int typeNum) {
		this.typeNum = typeNum;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	
}