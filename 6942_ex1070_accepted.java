import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int VolIni = s.nextInt();
		for(int i =s.nextInt();i>0;i--){
			int num =s.nextInt();
			VolIni+=num;
			if(VolIni>100||VolIni<0){
				if(VolIni>100)
					VolIni=100;
				
				else 
					VolIni=0;
				
			}

		}
		s.close();
		System.out.println(VolIni);
	}
}