package Test;



	interface RemoteControl {
		void turnOn();

		void turnOff();
	}

	public class AnonymousClassTest {
	public static void main(String args[]) {
		RemoteControl ac=new RemoteControl() {
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOFF()");
			}
					};
					ac.turnOn();
					ac.turnOff();
		
	}
	}
