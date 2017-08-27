import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String n1[] = new String[6];
		String n2[] = new String[6];
		int cont = 0;
		for (int i = 0; i < 6; i++) {
			n1[i] = s.next();
		}
		for (int se = 0; se < 6; se++) {
			n2[se] = s.next();
		}
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 6; i++) {
				if (n2[i].contentEquals((n1[j]))) {
					cont++;
					i = 6;
				}
			}
		}
		s.close();
		switch (cont) {
		case 3:
			System.out.println("terno");
			break;
		case 4:
			System.out.println("quadra");

			break;
		case 5:
			System.out.println("quina");

			break;
		case 6:
			System.out.println("sena");

			break;

		default:
			System.out.println("azar");

			break;
		}
	}
}