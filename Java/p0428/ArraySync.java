package p0428;

public class ArraySync extends Thread{
	private ArrayData arrData;

	public ArraySync(ArrayData arrData){
		this.arrData = arrData;
	}
	public void run(){
		for(int i =0 ;i<50 ;i++){
			arrData.PushArr(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class ArraySyncPop extends Thread{
	private ArrayData arrData;

	public ArraySyncPop(ArrayData arrData){
		this.arrData = arrData;
	}
	public void run(){
		for(int i =0 ;i<50 ;i++){
			arrData.PopArr();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}