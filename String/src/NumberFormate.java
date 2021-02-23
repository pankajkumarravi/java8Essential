import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormate {
	public static void main(String[] args) {
		Locale locale = new Locale("Hindi", "India");
		double dValue = 1_234_567.89;
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		System.out.println("Number : " + numberFormat.format(dValue));

		NumberFormat cuFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Number : " + cuFormat.format(dValue));
		NumberFormat intFormat = NumberFormat.getIntegerInstance(locale);
		System.out.println("Number : " + intFormat.format(dValue));
	}
}
