import java.util.Scanner;

public class BuildStringFromMultipleValues {
	public static void main(String[] args) {
		String string1 = "pankaj";
		String string2 = "kumar";
		String stringresult = string1 + string2;

		System.out.println(stringresult);
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		builder.append("!!!");
		System.out.println(builder);

		// OR
		StringBuilder builder2 = new StringBuilder("My name").append("is ").append("Pankaj ").append("Kumar");
		System.out.println(builder2);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		String input = scanner.nextLine();
		System.out.println(input);
		builder2.delete(0, builder2.length());
		for (int i = 0; i < input.length(); i++) {
			input = scanner.nextLine();
			builder2.append(input + "\n");
		}
		System.out.println(builder2);
	}
}
