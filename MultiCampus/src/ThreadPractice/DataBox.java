package ThreadPractice;

public class DataBox {
	private String data;
	public synchronized String getData() {
//	public String getData() {
//		while(this.data==null) {
			if(this.data==null)
				try {
				wait();	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	
		String returnValue=data;
		System.out.println("고객이 읽은 데이터:"+returnValue);
		data=null;
		notify();
		return returnValue;
	}
	public synchronized void setData(String data) {
//		while(this.data!=null) {
		if(this.data!=null) {
			try {
				wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("생산자가 생산한 데이터:"+data);
		this.data=data;
		notify();
	}

}
