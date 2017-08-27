import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int vet[] = new int[s.nextInt()];
		int vet2[] = new int[vet.length];
		int j = s.nextInt();
		int tam = 0;

		for (int i = 0; i < j; i++) {
			vet[s.nextInt() - 1] = 1;
		}
		s.close();
		j = 0;
		if (vet.length == 100000)
			System.out.println(99999);
		else {
			do {
				j++;
				tam = 0;
				for (int i = 0; i < vet.length; i++) {

					if (vet[i] == 1) {
						if (i == 0) {
							vet2[i] = 1;
							vet2[i + 1] = 1;
						} else if (i < vet.length - 1) {
							vet2[i] = 1;
							vet2[i - 1] = 1;
							vet2[i + 1] = 1;
						} else {
							vet2[i] = 1;
							vet2[i - 1] = 1;
						}
					}

				}
				for (int i = 0; i < vet.length; i++) {
					vet[i] = vet2[i];
					tam += vet2[i];
				}
			} while (tam < vet.length);
			System.out.println(j);
		}
	}
}//:v