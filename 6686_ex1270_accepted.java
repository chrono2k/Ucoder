import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a[] = new String[3];
		int am[] = new int[3];
		int t[] = new int[3];
		String f[] = new String[3];
		int j = 0;
		do {
			a[j] = s.nextLine();
			for (int i = 0; i < 3; i++) {
				t[i] = Integer.parseInt(s.next().replace("m", "").replace("c", "").replace(" ", ""));
			}
			s.nextLine();
			if (t[0] > t[1] && t[0] > t[2])
				am[j] = t[0];
			else if (t[1] > t[2])
				am[j] = t[1];
			else
				am[j] = t[2];

			String re = Integer.toString(am[j]).charAt(2) + "";
			re += Integer.toString(am[j]).charAt(3) + "";
			String rs = Integer.toString(am[j]).charAt(0) + "";
			rs += Integer.toString(am[j]).charAt(1) + "";
			f[j] = rs + "m" + re + "c";
			j++;
		} while (j < 3);

		s.close();
		for (int i = 2; i >= 0; i--)
			a[i] += " " + f[i];
		String aux = "";
		int aux2 = 0;
		if (am[0] > am[1] || am[0] > am[2]) {
			if (am[1] < am[2]) {
				aux = a[0];
				aux2 = am[0];
				a[0] = a[1];
				am[0] = am[1];
				a[1] = aux;
				am[1] = aux2;
			} else {// se c > b
				aux = a[0];
				aux2 = am[0];
				a[0] = a[2];
				am[0] = am[2];
				a[2] = aux;
				am[2] = aux2;
			}
		}

		if (am[1] > am[2]) {// se b < c
			aux = a[1];
			a[1] = a[2];
			a[2] = aux;
		}
		for (int i = 2; i >= 0; i--)
			System.out.println(a[i]);
	}
}// da para melhorar mas to com preguiça, depois eu melhoro :v