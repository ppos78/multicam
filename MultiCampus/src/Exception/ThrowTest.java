package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ThrowTest {
public static void main(String[] args) {
	Date date=null;
	try {
	date=getDate("2017:09:06 11:20:20");
	}catch (ParseException e) {
		e.printStackTrace();
	}
	System.out.println(date);
}

    public static Date getDate(String str) throws ParseException{
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
	Date date=null;
	try {
	    date=sdf.parse(str);
    }catch(ParseException e) {
	e.printStackTrace();
}
	return date;
}
}