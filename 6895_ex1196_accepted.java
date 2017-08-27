import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String pesomorto = s.next();
		String data = s.next();
		int dd;
		s.close();
		int mm;
		// dd/mm/aaaa
			dd = Integer.parseInt(data.charAt(0) + "" + data.charAt(1));
			mm = Integer.parseInt(data.charAt(3) + "" + data.charAt(4));

		if (dd == 1) {
			mm -= 1;
			if (mm == 2) {
				dd = 28;
			} else if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8
					|| mm == 10 || mm == 12) {
				dd = 31;
			} else
				dd = 30;
		}
		else{
			dd-=1;
		}
		if(dd<10||mm<10){
			if(dd<10&&mm<10){
				System.out.println("0"+dd + "/0" + mm + "/2015");
			}
			else{
				if(dd<10)
					System.out.println("0"+dd + "/" + mm + "/2015");
				else
					System.out.println(dd + "/0" + mm + "/2015");
			}
		}
		else
			System.out.println(dd + "/" + mm + "/2015");
	}

}