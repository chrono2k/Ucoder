#include <stdio.h>
#include <math.h>

main(){
	int n, max = 1, min;
	scanf("%d",&n);
		int i = 0;
		min = (int) pow(10, n - 1) * 2;
		max = (int) pow(10, n) - min;
		int tex = min;
		bool p = true;
		for (; min < max;) {
			int nimo = (int) pow(10, n - 1);
			while (i != 9 || nimo > 2) {
				i = min / nimo;
				for (int j = 2; j <= sqrt(i); j++)
					if (i % j == 0) {
						p = false;
						min += nimo;
						break;
					}
				if (p && nimo > 1)
					nimo /= 10;
				else
					break;
			}
			if (p && i >= tex) {
				printf("%d\n",min);
				min++;
			}
			p = true;
		}
}