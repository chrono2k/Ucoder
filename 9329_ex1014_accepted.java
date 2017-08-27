import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		float dist0[] = new float[26];
		Scanner s = new Scanner(System.in);
		int tam = s.nextInt();

		for (int i = 0; i < tam; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			int raio = s.nextInt();
			int misseis = s.nextInt();
			boolean ent = false;
			String letras = "";
			String letrasf = "";
			int cont = 0;

			float menor = 99999;
			letras = "";
			letrasf = "";

			for (int j = 0; j < misseis; j++) {
				int cont2 = 0;
				int cont3 = 0;
				int xm = s.nextInt();
				int ym = s.nextInt();
				if (Math.pow(xm - x, 2) + Math.pow(ym - y, 2) <= Math.pow(raio,
						2)) {
					char q = (char) (j + 66);
					ent = true;
					letras += q;
					dist0[cont++] = (float) Math.sqrt(Math.pow(xm - x, 2)
							+ Math.pow(ym - y, 2));
					cont2++;
				}
				cont3 = 0;
			}

			int cont3 = 0;
			float dist[] = new float[cont];
			for (int a = 0; a < cont; a++) {
				if (dist0[a] > 0) {
					dist[cont3++] = dist0[a];
				}
			}
			if (ent) {
				int posm = 0;
				for (int a = 0; a < cont; a++) {
					menor = 100;
					for (int b = 0; b < cont; b++) {
						if (dist[b] < menor) {
							menor = dist[b];
							posm = b;
						}
					}
					System.out.print(letras.charAt(posm));
					if(a<cont-1)
						System.out.print(" ");
					dist[posm] = 100;

				}
				System.out.println();
			} else
				System.out.println("OUT OF RANGE");
		}
	}
}
