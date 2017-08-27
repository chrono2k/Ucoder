import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int ma[][] = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				ma[i][j] = s.nextInt();
		s.close();
		boolean pr=true;
		boolean em=false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (ma[i][j] == 0) {
					for(int k=i;k<n;k++){
						if(ma[k][j]!=0){
							pr=false;
							break;
						}
					}for(int k=j;k>=0;k--){
						if(ma[i][k]!=0){
							pr=false;
							break;
						}
					}
					em=true;
				} else {
					if(em&&i!=n-1&&j!=n-1){
						if(ma[i+1][j]!=0){
							pr=false;
							break;
						}break;
					}else
						break;
				}
			}
			if(!pr)
				break;
		}
		if(pr)
			System.out.println('S');
		else
			System.out.println('N');
	}

}
