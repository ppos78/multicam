package IOPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
public static void main(String[] args) throws IOException {
	FileInputStream in=null;
	FileOutputStream out=null;
	int c;
	try {
		
		out=new FileOutputStream("data.txt",false);
		for(int i=0;i<10;i++) {
			out.write(i);
		}
		in=new FileInputStream("data.txt");
		while((c=in.read())!=-1)
			System.out.println(c);
		
		
	   }finally {
		try {
		if(in !=null) 
			in.close();
		
		if(out !=null) 
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
	}
}
}}