import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		// FFFCCCAASTNNN
		// CCAASNNN
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();

		for (int i = 0; i < c; i++) {
			String FFF = "003";
			String RAantigo = s.next();
			int t=0;
			String AA = RAantigo.charAt(2) + "" + RAantigo.charAt(3);
			String S = RAantigo.charAt(4) + "";
			String CC="";
			String NNN = RAantigo.charAt(5) + "" + RAantigo.charAt(6) + ""+ RAantigo.charAt(7);
			int cc = RAantigo.charAt(0) + RAantigo.charAt(1);
		
			if (cc == 133 || cc == 143) {
				CC = "048";
				if (cc == 133) {
					t = 1;
				} else {
					t = 3;
				}
			} else {
				if (cc == 151) {
				CC = "061";
				t = 1;
				} else {
				if (cc == 156) {
					CC = "080";
					t = 2;
				} else
					if (cc == 148 || cc == 158) {
						CC = "099";
						if (cc == 148) {
							t = 1;
						} else {
							t = 3;
					}
					} else {
						if(cc==160){
							t=2;
							CC="074";
						}
						else{
							CC = "100";
							if (cc == 147) {
								t = 1;
							} else {
							t = 3;
						}
					}
				}
					
			}
		}
			System.out.println(FFF + "" + CC + "" + AA + "" + S + "" + t + ""+ NNN);
		}
		s.close();
	}
}
