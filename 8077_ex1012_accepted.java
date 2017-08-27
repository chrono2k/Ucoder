import java.util.Scanner;


public class Main {
	public static void main (String args[]){
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for (int c = 0; c <q; c++) {
			int p = s.nextInt();
			int m = s.nextInt();
			int v1 [][]=new int [m][p];
			int vp [][]= new int [p][2];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j <p; j++) {
					v1[i][j]=s.nextInt();
				}
			}
			for (int i = 0; i < p; i++) {
				for (int j = 0; j < 2; j++) {
					vp[i][j]=s.nextInt();
				}
			}
			int cost,profit;
			System.out.println("Case "+(c+1)+":");
			for (int i = 0; i < m; i++) {
				cost =0;
				profit=0;
				for (int j = 0; j < p; j++) {
					cost+=v1[i][j]*vp[j][0];
					profit+=v1[i][j]*vp[j][1];
				}
				System.out.println(cost+" "+profit);
			}
		}
	s.close();
	}
}
