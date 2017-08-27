import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String estr = "";
		int i = s.nextInt();
		do {
			int cont = 0;
			String frase = s.nextLine().replace(",", "").replace(" ", "");
			if (frase.length() > 0) {
				for (int j = 0; j < frase.length(); j++) {
					if (estr.indexOf(frase.charAt(j)) < 0) {
						estr += frase.charAt(j);
						cont++;
					}

				}
				estr = "";
				if (cont == 26) {
					System.out.println("frase completa");
				} else if (cont >= 13)
					System.out.println("frase quase completa");
				else
					System.out.println("frase mal elaborada");
				i--;
			}
		} while (i > 0);
		s.close();
	}
}