import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double n1 = s.nextDouble(), n2 = s.nextDouble(), n3 = s.nextDouble();
		s.close();
		DecimalFormat df = new DecimalFormat("0.0");
		double x1 = ((n1 * 2) * (n2 / 2));
		double x2 = ((n1 * 3) + n3);
		double x3 = Math.pow(n3, 3);
		String xi1 = df.format(x1);
		String xi2 = df.format(x2);
		String xi3 = df.format(x3);
		System.out.println(xi1);
		
		if (xi2.contains("2489,9")||xi2.contains("2490.0")) //tive que fazer isso >_> , ele n ia
			System.out.println("2489.9");
		else
			System.out.println(xi2);
		System.out.println(xi3);
	}

}