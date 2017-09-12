package ThreadPractice;

class Count extends Thread {
	public void run() {
		for(int i=0;i<10;i++) 
//			System.out.println(i);
			System.out.println(Thread.currentThread().getId()+"//"+i);
		}
	}

public class Counting{
public static void main(String[] args) {
		Thread t=new Count();
		t.start();
		t.run();
	}
}

