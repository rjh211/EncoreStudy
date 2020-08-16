package p0421.project;

public class Main {
	public static void main(String[] args){
		Service service = new Service(new DAOImplOracle());
		service.Add();
		service.Get();
		service.Edit();
		service.Del();
	}
}
