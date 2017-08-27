import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
			double a = s.nextDouble()*s.nextDouble();
			s.close();
			DecimalFormat df = new DecimalFormat("0.00");
		    String n2 = df.format(a);
		    System.out.println(n2);
	}

}