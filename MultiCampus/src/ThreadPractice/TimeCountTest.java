package ThreadPractice;

class TimeCount implements Runnable {
   private boolean stop=true;
   public void setStop(boolean stop)
   {
	   this.stop=stop;
   }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sec = 0;
		while (stop) {
//		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sec++;
			System.out.println(sec + "초");
		}
	}

}

public class TimeCountTest {
	public static void main(String[] args) {
		TimeCount tc=new TimeCount();
		Thread t=new Thread(tc);
		
//		Thread t = new Thread(new TimeCount());
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tc.setStop(false);
	}
}