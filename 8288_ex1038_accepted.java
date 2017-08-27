import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		int ni = 0;
		int ne = 0;
		int ig = 0;
		int vet[] = new int[d];
		int e = 0;
		int mat[][] = new int[d][d];
		for (int i = 0; i < d; i++) {
			ni = 0;
			for (int j = 0; j < d; j++) {
				mat[i][j] = s.nextInt();
				ni += mat[i][j];
			}
			vet[e++] = ni;
		}
		Arrays.sort(vet);
		int dif = 0;
		if (vet[0] == vet[1]) {
			ig = vet[0];
			dif = vet[d - 1];
		} else {
			dif = vet[0];
			ig = vet[1];
		}
		dif -= ig;
		int oi = 0;
		int oe = 0;
		for (int i = 0; i < d; i++) {
			ne = 0;
			ni = 0;
			for (int j = 0; j < d; j++) {
				ni += mat[i][j];
				ne += mat[j][i];
			}
			if (ne != ig) {
				oe = i;
			}
			if (ni != ig) {
				oi = i;
			}
		}
		System.out.println((mat[oi][oe] - dif) + " " + mat[oi][oe]);
		s.close();

	}
}
