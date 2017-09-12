package IOPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class HelloReaderTest {
private static final String MS949 = null;

public static void main(String[] args) {
	Reader reader=null;
	try {
		reader= new InputStreamReader(
				new FileInputStream("src/hello.txt"),MS949);
		int c;
		while((c=reader.read())!=-1)
			System.out.print((char)c);
					
	}catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(reader!=null)
				reader.close();
		}catch(IOException e) {
			e.printStackTrace();		
	}
}
}}
