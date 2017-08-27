import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
    Scanner s= new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    float n1 = ((float)s.nextInt()/s.nextInt());
    String n2 = df.format(n1);
    s.close();
 
    System.out.println(n2);
    }
}