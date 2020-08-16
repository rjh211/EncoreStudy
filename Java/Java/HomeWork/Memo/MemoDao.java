package HomeWork.Memo;

import java.util.ArrayList;

public interface MemoDao {
	void insert(Memo m);

	Memo select(String name);

	ArrayList<Memo> selectAll();

	void update(Memo m);

	void delete(String name);
}
