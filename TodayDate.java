import java.time.LocalDate;
import java.time.LocalTime;
public class TodayDate {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println("today's date is :"+date);
		LocalTime time = LocalTime.now();
		System.out.println("Current Time  is :"+time);

	}

}