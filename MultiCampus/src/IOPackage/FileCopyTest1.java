package IOPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {
public static void main(String[] args) {
	
	FileOutputStream fo=null;
	FileInputStream  fi=null;
	
	try {
		fi=new FileInputStream("hotel english.jpg");
		fo=new FileOutputStream("hotel english_copy.jpg");
		long start=System.currentTimeMillis();
//		int c=fi.read();
//		fo.write(c);
//		int c;
//		while((c=fi.read())!=-1)
//			fo.write(c);
//		long end=System.currentTimeMillis();
//		System.out.println(end-start+"ms");
//		System.out.println("come");
		
		byte[]buf=new byte[512];
		int length;
		while((length=fi.read(buf))>0) {
			fo.write(buf,0,length);
		}
		
		
	}catch(IOException e) {
		e.printStackTrace();
	}

finally {
	try {
		if(fi!=null)
			fi.close();
		if(fo!=null)
			fo.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}}
