import java.text.NumberFormat;

public class PrimitiveToString {
	public static void main(String[] args) {

		int i = 17876;
		boolean b = false;
		long l = 7866580L;
		String is = Integer.toString(i);
		String bs = Boolean.toString(b);
		//default format
		String ls=Long.toString(l);
		System.out.println(is);
		System.out.println(bs);
		System.out.println(ls);
		//use seperator using underscore inroduced in 1.7
		long longval=20_000_000;
		//complex format
		NumberFormat numberFormat=NumberFormat.getNumberInstance();
		String numFormated=numberFormat.format(longval);
	   System.out.println(numFormated);
	}
}
