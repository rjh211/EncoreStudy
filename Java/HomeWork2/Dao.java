package HomeWork2;

public interface Dao {
	void Insert(Product p);
	int GetIdxByNum(int num);
	Product SelectByNum(int num);
	Product[] SelectByName(String name);
	Product[] SelectAll();
	void UpdatePrice(Product p);
	boolean InOut(Product p );
	void Delete(int num);
}
