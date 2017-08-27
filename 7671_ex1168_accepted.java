import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int a = 0;
		Scanner s = new Scanner(System.in);
		do {
			a = s.nextInt();
			if (a != 0) {
				int vet[] = new int[a], vet2[] = new int[a];
				for (int i = 0; i < a; i++) {
					vet[i] = s.nextInt();
					vet2[i] = vet[i];
				}
				Arrays.sort(vet);
				int posi = 0;
				for (int i = 0; i < a; i++) {
					if (vet[a - 2] == vet2[i]) {
						posi = i + 1;
						break;
					}
				}
				System.out.println(posi);
			}
		} while (a != 0);
		s.close();
	}
}
