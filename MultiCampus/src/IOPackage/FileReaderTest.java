package IOPackage;

import java.io.*;

public class FileReaderTest {
public static void main(String[] args) throws IOException {
	FileReader in=null;
	FileWriter out=null;
	String s="꿈에 미치면 신화가 된다";
	
	out=new FileWriter("test.txt");
	out.write(s);
	out.append(".");
	out.flush();
	
	in=new FileReader("test.txt");
	int c;
	while((c=in.read())!=-1) {
		System.out.print((char)c);
	}
	if(in!=null)in.close();
	if(out!=null)out.close();
}
}
