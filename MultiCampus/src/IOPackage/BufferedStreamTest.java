package IOPackage;

import java.io.*;

public class BufferedStreamTest  {
public static void main(String[] args)throws IOException {
	BufferedInputStream in=null;
	BufferedOutputStream out=null;
	int c;
	
	try {
	out=new BufferedOutputStream(new FileOutputStream("data.txt"),6);
	for (int i=0;i<5;i++) {
		out.write(i);
	}
	
	out.flush();
	in=new BufferedInputStream(new FileInputStream("data.txt"));
	while((c=in.read())!=-1) {
	System.out.println(c+"");
}
}finally {
	if(in!=null) {
		in.close();
	}
	if(out!=null) {
		out.close();
	}
}
}}