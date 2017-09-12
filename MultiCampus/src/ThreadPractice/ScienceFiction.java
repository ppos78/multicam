package ThreadPractice;

public class ScienceFiction extends Book{
	private static final int LATE_FEE=500;
	@Override
	public int getLateFee(int days) {
		return days*LATE_FEE;
	}
	
}
