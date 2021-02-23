
public class Loops {
	public static void main(String[] args) {
		String monts[] = { "january", "feburary", "March", "April", "may", "June", "July", "August", "Sepetember",
				"october", "November", "December" };
		// For Loop
		System.out.println(":::::::::::::::::For loop o/p ::::::::::::::");
		for (int i = 0; i < monts.length; i++) {
			System.out.println(monts[i]);
		}
		// for loop in reverse order
		System.out.println(" +++++++++++ Rev for loop +++++++++++++ ");
		for (int j = monts.length - 1; j >= 0; j--) {
			System.out.println(monts[j]);
		}
		// while loop
		System.out.println("@@@@@@@@@@@@@ While Loop @@@@@@@@@@@@");
		int i = 0;
		while (i < monts.length) {
			System.out.println(monts[i]);
			i++;
		}
		// do While Loop
		i = 0; // to bring i value to 0
		System.out.println(" %%%%%%%%%%% do While Loop o/p %%%%%%%% ");
		do {
			System.out.println(monts[i]);
			i++;
		} while (i < monts.length);
		// for each loop
		System.out.println(" $$$$$$$$$ For each Loop $$$$$$$$$$$$");
		for (String string : monts) {
			System.out.println(string);
		}

	}
}
