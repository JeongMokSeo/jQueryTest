package d.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateCalTest {
	public static void main(String[] args) {
		DateCalTest obj = new DateCalTest();
		obj.checkDate();
		System.out.println("-------------------------------");
		obj.useCalendar();
		System.out.println("-------------------------------");
		Calendar cal = new GregorianCalendar(2000,11,31);
		obj.addRoll(cal,10);
	}

	private void checkDate() {
		Date date = new Date();
		
		long time = date.getTime();
		System.out.println(time);
		
		date.setTime(1529476935564l);
		System.out.println(date);
		
		date.setTime(0);
		System.out.println(date);
		
		
	}
	
	public void useCalendar() {
		Calendar cal = Calendar.getInstance();
		Calendar greCal = new GregorianCalendar();
		
		System.out.println(cal);
		System.out.println(greCal);
		
		int year = greCal.get(Calendar.YEAR);
		int month = greCal.get(Calendar.MONTH) + 1;
		int date = greCal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "-" + month + "-" + date);
		
		String monthKr = greCal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREA);
		String monthUs = greCal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
		String monthUs2 = greCal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
	
		System.out.println(monthKr);
		System.out.println(monthUs);
		System.out.println(monthUs2);
	}
	
	public void addRoll(Calendar cal, int amt) {
		cal.add(Calendar.DATE, amt);
		printCalendar(cal);
		cal.add(Calendar.DATE, -amt);
		printCalendar(cal);
		cal.roll(Calendar.DATE, amt);
		printCalendar(cal);
	}

	private void printCalendar(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREA);
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year + "-" + month + "-" + date);	
	}
	
	
	
}
