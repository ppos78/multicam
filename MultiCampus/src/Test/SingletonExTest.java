package Test;

public class SingletonExTest {
public static void main(String[] args) {
	Singleton a=Singleton.getInstance();
	Singleton b=Singleton.getInstance();
			
	if(a==b) {
		System.out.println("같은 Singleton 객체입니다.");
				
	}else {
		System.out.println("다른 Singleton 객체입니다.");
	}
}
}
