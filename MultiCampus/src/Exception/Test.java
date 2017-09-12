package Exception;

import java.io.IOException;

public class Test {
public static void main(String[] args) {
	try {
		System.out.println(readString());	
	}catch(IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
//public static String readString() {
//	byte[]buf=new byte[100];
//	System.out.println("문자열을 입력하시오:");
//	try {
////		throw new IOException("내가 만든 예외");
//		System.in.read(buf);
//		
//	}catch(IOException e) {
//		System.out.println(e.getMessage());
//		e.printStackTrace();
//	}
//	return new String(buf);
//}
public static String readString()throws IOException {
	byte[]buf=new byte[100];
	System.out.println("문자열을 입력하시오:");
	try {
//		throw new IOException("내가 만든 예외");
		System.in.read(buf);
		
	}catch(IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return new String(buf);
}
}
