package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar calendar = Calendar.getInstance();//싱글톤 패턴, static으로 만들어놓음
		calendar.getTime();
		
		
	}

}
