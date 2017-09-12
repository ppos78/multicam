package ThreadPractice;

public class Poet extends Book {
	private static final int LATE_FEE=300;
	@Override
	public int getLateFee(int days) {
		return days*LATE_FEE;
	}
	
}


