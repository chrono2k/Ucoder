import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		float a [][]= new float [3][3];
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=s.nextFloat();
			}
		}
		s.close();
		System.out.print("DIAGONAL PRINCIPAL ");
		float tot=0;
		for(int i=0;i<3;i++){
			System.out.printf("%.2f ",a[i][i]);
			tot+=a[i][i];
		}
		System.out.printf("%.2f\n",tot);
		tot=0;
		System.out.print("DIAGONAL SECUNDARIA ");
		for(int i=0;i<3;i++){
			System.out.printf("%.2f ",a[i][2-i]);
			tot+=a[i][2-i];
		}
		System.out.printf("%.2f\n",tot);
	}
}
