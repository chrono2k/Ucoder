import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = "aeiou";

		String b = s.next().toLowerCase();

		if (a.indexOf(b.charAt(0)) >= 0)
			System.out.println("vogal");
		else
			System.out.println("consoante");

	}
}