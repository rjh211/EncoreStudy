package p0421.project;

public class Service {
	private DAO dao;
	public Service(DAO dao){	//upcasting으로 DB별로 선택 => 의존성 주입
		this.dao = dao;
	}
	public void Add(){
		dao.Insert();
	}
	public void Get(){
		dao.Select();
	}
	public void Edit(){
		dao.Update();
	}
	public void Del(){
		dao.Delete();
	}
}
