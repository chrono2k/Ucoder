import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		float sal = s.nextFloat();
		s.close();
		float reajuste;
		String porc = "";
		if (sal < 281) {
			reajuste = sal * 0.20f;
			porc = "20%";
		} else {
			if (sal < 701) {
				reajuste = sal * 0.15f;
				porc = "15%";
			} else {
				if (sal < 1501) {
					reajuste = sal * 0.10f;
					porc = "10%";
				} else {
					reajuste = sal * 0.05f;
					porc = "5%";
				}
			}
		}
		System.out.printf("%.2f",sal);
		System.out.println("\n"+porc);
		System.out.printf("%.2f",reajuste);
		System.out.println();
		System.out.printf("%.2f",(sal+reajuste));
		System.out.println();
	}
}