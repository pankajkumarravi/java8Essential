import java.util.ArrayList;
import java.util.List;

public class ListProj {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Karnatika");
		list.add("TamilNaidu");
		list.add("Andhra Pradesh");
		System.out.println(list);
		list.add("Bihar");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		// find a Object
		int position = list.indexOf("Bihar");
		System.out.println(position);
	}
}
