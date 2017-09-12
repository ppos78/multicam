package ThreadPractice;

class CountingRunnable implements Runnable {

	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getId()
					+"//"+i);
		}
	}

public class CountingTest{
	public static void main(String[] args) {
		Thread t=new Thread(new CountingRunnable());
		t.start();
	}
	
}
