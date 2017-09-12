package ThreadPractice;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(new Novel());
		bookList.add(new Poet());
		bookList.add(new ScienceFiction());
		
		for(Book b: bookList)
			System.out.println(b.getLateFee(3));
		
	}

}
