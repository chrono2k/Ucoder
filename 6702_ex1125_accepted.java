import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	float n1 = (s.nextFloat()+s.nextFloat()+s.nextFloat()+s.nextFloat())/4;
	s.close();
    DecimalFormat df = new DecimalFormat("0.0");
    String n2 = df.format(n1);
    s.close();
    
    System.out.println(n2);
	}
}