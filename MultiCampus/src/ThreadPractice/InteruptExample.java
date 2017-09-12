package ThreadPractice;

class PrintThread2 extends Thread{
public void run() {
	while(true) {
		System.out.println("실행중");
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
			break;
		}
	}
		System.out.println("자원정리//종료");
	}
}
public class InteruptExample {
	public static void main(String[] args) {
		PrintThread2 pt=new PrintThread2();
		pt.start();
		try {
			Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		pt.interrupt();
}
}
