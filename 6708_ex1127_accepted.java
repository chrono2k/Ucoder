import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double c = Math.pow(s.nextDouble(),2)*3.1415;
		s.close();
		DecimalFormat df = new DecimalFormat("0.0000");
	    String n2 = df.format(c);
		System.out.println(n2);

	}
	
}