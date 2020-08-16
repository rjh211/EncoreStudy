package p0428;

public class ArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayData arrData = new ArrayData();
		ArraySync pushSync = new ArraySync(arrData);
		ArraySyncPop popSync = new ArraySyncPop(arrData);
		
		pushSync.start();
		popSync.start();
	}

}
