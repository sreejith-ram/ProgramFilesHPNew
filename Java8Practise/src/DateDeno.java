import java.time.LocalDate;
import java.time.Period;

public class DateDeno {

	public static void main(String[] args) {
		LocalDate Birthday =LocalDate.of(1999, 8, 8);
		System.out.println(Birthday);
		
		LocalDate today=LocalDate.now();
		Period p=Period.between(Birthday, today);
		System.out.println("Your age is: "+p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days.");
	}

}
