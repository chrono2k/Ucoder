import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String[] cod =new String [] { "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i"
				, "j" , "k" , "l",  "m" , "n" , "o" , "p" , "q" , "r" , "s"
				, "t", "u" , "v" , "w" , "x" , "y" , "z" };
		String se = s.next();
		String[] COD = new String[26];
		for (int i = 0; i < 26; i++) {
			COD[i] = se.charAt(i) + "";
		}
		String f = s.next();
		s.close();
		String f2 = "";
		for (int i = 0; i < f.length(); i++) {
			for (int h = 0; h < 26; h++) {
				if (COD[h].charAt(0) == f.charAt(i)) {
					f2 += cod[h];
				}
			}
		}
		System.out.println(f2);
	}
}