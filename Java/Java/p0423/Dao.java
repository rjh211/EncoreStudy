package p0423;

import java.util.ArrayList;

public interface Dao {
	void Insert(Member m);
	Member Select(String name);
	ArrayList<Member> SelectAll();
	void Update(Member m);
	void Delete(String name);
	
}
