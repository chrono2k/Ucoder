import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		int n[] = new int[str.length()];
		int p[] = new int[str.length()];
		int valor[] = { 1, 5, 10, 50, 100, 500, 1000 };
		String alfabeto = "IVXLCDM";
		int i, k, res, v;
		for (k = 0; k < 7; k++)
			for (i = 0; i < str.length(); i++)
				if (str.charAt(i) == alfabeto.charAt(k))
					n[i] = p[i] = valor[k];

		for (res = 0, k = 0; k < 7; k++, res += v)
			for (v = 0, i = 0; i < str.length(); i++)
				if (n[i] == valor[k])
					v += p[i];
				else if (n[i] > valor[k]) {
					p[i] -= v;
					v = 0;
				}
		System.out.println(res);
	}
}
