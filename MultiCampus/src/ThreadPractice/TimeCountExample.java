package ThreadPractice;

import java.util.Scanner;

class TimeCount2 implements Runnable {
	private int sec;
	private boolean flag=true;
	public int getSec() {
		return sec;
	}
	public void setFlag(boolean flag) {
		this.flag=flag;
			}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag) {
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}sec++;
	}
}

public class TimeCountExample{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		TimeCount2 tc=new TimeCount2();
		Thread t=new Thread(tc);
		while(true) {
			System.out.println("1.시작| 2.종료 | 3.시간출력");
			int sel=scan.nextInt();
			if(sel==1)
				t.start();
			else if(sel==2) {
				tc.setFlag(false);
				break;
			}
			else if(sel==3)
				System.out.println(tc.getSec());
			
			}
		}
	}
