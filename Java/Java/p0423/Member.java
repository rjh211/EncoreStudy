package p0423;

public class Member {
	private String name, tel, address;
	public Member(){
		
	}
	public Member(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Member){			
			Member obj2 = (Member) obj;
			if(obj2.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}
}
