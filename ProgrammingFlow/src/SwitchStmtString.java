import java.util.Scanner;

public class SwitchStmtString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scanner.nextLine();
		switch (input) {
		case "Jan":
			System.out.println("The Month is january");
			break;
		case "Feb":
			System.out.println("The Month is Faburary");
			break;
		case "Mar":
			System.out.println("The Month is March");
			break;
		case "Apr":
			System.out.println("The Month is April");
			break;
		case "May":
			System.out.println("The Month is May");
			break;
		case "Jun":
			System.out.println("The Month is June");
			break;
		case "Jul":
			System.out.println("The Month is July");
			break;
		case "Aug":
			System.out.println("The Month is August");
			break;
		case "Sep":
			System.out.println("The Month is September");
			break;
		case "Oct":
			System.out.println("The Month is October");
			break;
		case "Nove":
			System.out.println("The Month is November");
			break;
		case "Dec":
			System.out.println("The Month is December");
			break;
		default:
			System.out.println("Not  a valid Str");
			break;

		}
	}
}
