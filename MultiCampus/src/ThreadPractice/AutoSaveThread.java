package ThreadPractice;

public class AutoSaveThread extends Thread{

	public void save() {
		System.out.println("저장");
	}
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			break;
		}
			save();
		}
	}
}
