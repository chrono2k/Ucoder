import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = s.nextInt();
		int tot;
		int maior = 0;
		int n1 = s.nextInt();
		tot = 0;
		int n2 = s.nextInt();
		if(n1 == n2)
			tot+=2;
		while (cont > 2) {
			n2 = s.nextInt();

			if (n1 == n2) {
				tot++;
			} else {

				tot = 1;
				n1 = n2;
			}
			if (tot > maior) {
				maior = tot;

			}
			cont--;

		}
		s.close();
		System.out.println(maior);
	}
}