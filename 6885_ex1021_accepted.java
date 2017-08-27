import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		// FFFCCCAASTNNN
		// CCAASNNN
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();

		while (i > 0) {
			double alt = s.nextDouble();
			double peso = s.nextDouble();
			double peso2 = s.nextDouble();
			double imc = peso / (alt * alt);
			double gi = 0, ga = 0;

					if (imc < 18.5) {
						gi = 12.5+peso;
						ga = 18+peso;
					} else {

						if (imc < 25) {
							gi = 11 + peso;
							ga = 16 + peso;

						} else if (imc < 30) {
							gi = 7 + peso;
							ga = 11.5 + peso;
						} else {
							gi = 5 + peso;
							ga = 9 + peso;
						}
					}
					if (peso2 > gi && peso2 < ga) {
						System.out.println("GANHO NORMAL");
					} else if (peso2 > gi) {
						System.out.println("GANHO EXAGERADO");
					} else
						System.out.println("GANHO INSUFICIENTE");
					i--;
				}

		s.close();
	
	}
}