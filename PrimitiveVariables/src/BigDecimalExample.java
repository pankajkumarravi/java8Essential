import java.math.BigDecimal;

public class BigDecimalExample {
	public static void main(String[] args) {
		double d = .012;
		double dsum = d + d + d;
		System.out.println("Double sum = " + dsum); // Double sum = 0.036000000000000004
		// We can solve precision problem by Bigdecimal
		String strValue = Double.toString(d);
		System.out.println("Str value : "+ strValue);
		BigDecimal bigValue = new BigDecimal(strValue);
		BigDecimal sum = bigValue.add(bigValue).add(bigValue);
		System.out.println("Sum of BigDecimal = "+sum);
	}
}
