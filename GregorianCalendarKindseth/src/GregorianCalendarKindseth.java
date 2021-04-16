import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalendarKindseth {
	
	public static void main(String[] args) {
		GregorianCalendar calend = new GregorianCalendar();
		GregorianCalendar myBirthday = new GregorianCalendar(2002,Calendar.APRIL, 6);
		int dayOfMonth = calend.get(Calendar.DAY_OF_MONTH); 
		int month = calend.get(Calendar.MONTH);
		int year = calend.get(Calendar.YEAR);
		int weekday = calend.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("1 = Sunday, 2 = Monday, 3 = Tuesday, 4 = Wednesday, 5 = Thursday, 6 = Friday, 7 = Saturday");
		System.out.println();
		System.out.println("Today\'s dates is " + (month + 1)  +  "/" + dayOfMonth + "/" + year );
		System.out.println("Day of week is " + weekday);
		System.out.println();
		calend.add(calend.DAY_OF_MONTH, 100);
		dayOfMonth = calend.get(Calendar.DAY_OF_MONTH); 
		month = calend.get(Calendar.MONTH);
		year = calend.get(Calendar.YEAR);
		weekday = calend.get(Calendar.DAY_OF_WEEK);
		System.out.println("Date in 100 days from today is " +  (month + 1) +  "/" + dayOfMonth + "/" + year  );
		System.out.println("Day of week is " + weekday );
		System.out.println();
		System.out.println("My Birth Date " + (myBirthday.get(Calendar.MONTH)+ 1) + "/" + myBirthday.get(Calendar.DAY_OF_MONTH) + "/" +myBirthday.get(Calendar.YEAR)) ;
		System.out.println("Day of week is " + myBirthday.get(Calendar.DAY_OF_WEEK) );
		System.out.println();
		myBirthday.add(myBirthday.DAY_OF_MONTH, 10000);
		System.out.println("Date 10000 days after my birthday: " + (myBirthday.get(Calendar.MONTH)+ 1) + "/" + myBirthday.get(Calendar.DAY_OF_MONTH) + "/" +myBirthday.get(Calendar.YEAR)) ;
	}

}
