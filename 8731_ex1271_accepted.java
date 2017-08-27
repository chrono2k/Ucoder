import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String n1 = s.nextLine();
		String tr1 = s.nextLine();
		String n2 = s.nextLine();
		String tr2 = s.nextLine();
		String n3 = s.nextLine();
		String tr3 = s.nextLine();
		float t1=75/Float.parseFloat(tr1)*60;
		float t2=75/Float.parseFloat(tr2)*60;
		float t3=75/Float.parseFloat(tr3)*60;
		int h1 = (int)t1 / 60, h2 =(int) t2 / 60, h3 =(int) t3 / 60, m1 = (int)t1 % 60, m2 = (int)t2 % 60, m3 =(int) t3 % 60;
		if (t1 > t2 || t1 > t3) {
			if (t1 > t2 && t1 > t3) {
				if (t2 > t3) {
					System.out.println(n3 + " " + h3 + "h" + m3);
					System.out.println(n2 + " " + h2 + "h" + m2);
					System.out.println(n1 + " " + h1 + "h" + m1);
				} else {
					System.out.println(n2 + " " + h2 + "h" + m2);
					System.out.println(n3 + " " + h3 + "h" + m3);
					System.out.println(n1 + " " + h1 + "h" + m1);
				}
			} else {
				if (t2 > t3) {
					System.out.println(n3 + " " + h3 + "h" + m3);
					System.out.println(n1 + " " + h1 + "h" + m1);
					System.out.println(n2 + " " + h2 + "h" + m2);

				} else {
					System.out.println(n2 + " " + h2 + "h" + m2);
					System.out.println(n1 + " " + h1 + "h" + m1);
					System.out.println(n3 + " " + h3 + "h" + m3);
				}

			}
		} else {
			if (t2 > t3) {
				System.out.println(n1 + " " + h1 + "h" + m1);
				System.out.println(n3 + " " + h3 + "h" + m3);
				System.out.println(n2 + " " + h2 + "h" + m2);
			} else {
				System.out.println(n1 + " " + h1 + "h" + m1);
				System.out.println(n2 + " " + h2 + "h" + m2);
				System.out.println(n3 + " " + h3 + "h" + m3);
			}
		}
		s.close();

	}

}
