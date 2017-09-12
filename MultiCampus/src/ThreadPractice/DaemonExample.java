package ThreadPractice;

public class DaemonExample {
public static void main(String[] args) {
	AutoSaveThread ast=new AutoSaveThread();
	ast.setDaemon(true);
	ast.start();
	try {
		Thread.sleep(3000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
