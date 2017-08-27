import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int va = 0;
		int v1 = 10000;
		int v[] = new int[s.nextInt()];
		int va1=s.nextInt();
		
		for (int i = 0; i < v.length; i++) {
			v[i] = s.nextInt();

		}
		s.close();
		va+=va1;
		v1 = va;

		for (int i = 0; i < v.length; i++) {
				va += v[i];
				if (va < v1) {
					v1 = va;	
			}
		}
		System.out.println(v1);
	}
}