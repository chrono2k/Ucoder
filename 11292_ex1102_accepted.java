import java.util.Scanner;

public class Main {
	
	static long feijoes(long x, long n ) {
		if( x == 1 ) 
			return 1;
		x--;
		return 4*x*( n - x ) + 1;
	}

	static long ij(long n, long b ) {
		long d = n*n - b + 1;
		double delta = Math.sqrt( d );
		return (long)(n - delta )/2;
	}

	public static void main(String args[]){
		long n, b, l, x = 1, y = 1;

		Scanner s = new Scanner(System.in);
		n=s.nextLong();
		b=s.nextLong();
		l = ij( n, b );
		x += l;
		y += l;
		l++;
		b -= feijoes( l, n );
		n = n - 2*l + 1;

		if( b > 0 ) {
			if( b >= n ) y += n;
			else y += b;
			b -= n;
		}

		if( b > 0 ) {
			if( b >= n ) x += n;
			else x += b;
			b -= n;
		}

		if( b > 0 ) {
			if( b >= n ) y -= n;
			else y -= b;
			b -= n;
		}

		if( b > 0 ) {
			if( b >= n ) x -= n;
			else x -= b;
		}

		System.out.println(x+" "+y);
}

}
