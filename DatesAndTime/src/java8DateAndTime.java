import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java8DateAndTime {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		LocalDate date=LocalDate.of(2020, 1, 28);
		System.out.println(date);
		DateTimeFormatter formatter=DateTimeFormatter.ISO_DATE;
		System.out.println(formatter.format(date));
		//Date in specific format
		DateTimeFormatter formatedDate=DateTimeFormatter.ofPattern("M/dd/yyyy");
		System.out.println(formatedDate.format(date));
	}
}
