#include <stdio.h>


main(){
	int cha,cont=0,j;
	scanf("%d",&cha);
	for(int i =0;i<5;i++){
		scanf("%d",&j);
			if(j==cha)
				cont++;
		}
		printf("%d\n",cont);
}







