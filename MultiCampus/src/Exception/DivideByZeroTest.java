package Exception;

	public class DivideByZeroTest {

		public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int x=1;
//		int y=0;
		int y=1;
		int result=0;//초기화까지 해놔야 결과 출력
				
		try {
		
			result=x/y;
			return;
		}
		catch(ArithmeticException e) {
			System.out.println("o으로 나눌 수 없음");
		}
		finally {
			System.out.println("fianally");
		System.out.println("result:"+result);
		System.out.println("프로그램 종료");
	}
		}}
