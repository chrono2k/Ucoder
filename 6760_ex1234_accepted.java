import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ano = s.nextInt();
		s.close();
		boolean bissexto;

		if (ano % 400 == 0) {
			bissexto = true;
		} else 
			if ((ano % 4 == 0) && (ano % 100 != 0)) {
				bissexto = true;
			} 
			else {
				bissexto = false;
		}

		if (bissexto == true)
			System.out.println("S");
		else
			System.out.println("N");
	}
}