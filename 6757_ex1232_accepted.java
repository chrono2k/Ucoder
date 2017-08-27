import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		switch (c) {
		case 'M':
			System.out.println("Bom Dia!");
			break;
		case 'V':
			System.out.println("Boa Tarde!");
			break;
		case 'N':
			System.out.println("Boa Noite!");
			break;
		default:
			System.out.println("Valor Invalido!");
			break;
		}
		s.close();
	}
}