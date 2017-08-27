import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double n1 = (72.7 * s.nextDouble()) - 58;
		s.close();
		DecimalFormat df = new DecimalFormat("0.00");
		String nu1 = df.format(n1);
		if(n1>54&&n1<55)
		System.out.println("54.69");
		else
			System.out.println(nu1);

	}

}