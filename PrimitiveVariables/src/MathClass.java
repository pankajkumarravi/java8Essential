
public class MathClass {
	public static void main(String[] args) {
		double doubleValue = -987.999;
		long result = Math.round(doubleValue);
		System.out.println("Rounded value = " + result);
		System.out.println(Math.abs(doubleValue));
		// Strimg to boolean conversion
		String stringVal = "true";
		boolean booleanval = Boolean.parseBoolean(stringVal);
		System.out.println(" Parsed value = "+booleanval);
	}
}
