package java8.date;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDateTime1 {
	 public static void main(String[] args) {

	        LocalDateTime ldt = LocalDateTime.of(2017, Month.APRIL, 28, 11, 38, 59);

	        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
	        System.out.println(dayOfWeek);     
	        Month month = ldt.getMonth();
	        System.out.println(month);         

	        long minuteOfDay = ldt.getLong(ChronoField.MINUTE_OF_DAY);
	        System.out.println(minuteOfDay);  

	        Instant instant = ldt
	                .atZone(ZoneId.systemDefault())
	                .toInstant();

	        Date legacyDate = Date.from(instant);
	        System.out.println(legacyDate);    


	        DateTimeFormatter formatter =
	                DateTimeFormatter
	                        .ofPattern("MMM dd, yyyy - HH:mm");

	        LocalDateTime parsed = LocalDateTime.parse("Apr 28, 2017 - 11:13", formatter);
	        String string = parsed.format(formatter);
	        System.out.println(string);    
	    }
}
