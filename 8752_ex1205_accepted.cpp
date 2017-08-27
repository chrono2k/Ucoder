#include <stdio.h>
#include<iostream>
using std::cin;
#include<string>
using std::string;
using std::getline;

int main(){
	string a;
    getline(cin, a);
    float tot=0,num=0;
	for(int i =0;i<a.length();i++){
        if((a[i]=='1'&&i!=a.length()-1)&&a[i+1]=='0'){
        	i++;
            tot+=10;
        }else{
            tot+=(int)a[i];
            tot-=48;
        }
        num++;
    }
    tot/=num;
		printf("%.2f\n",tot);
	return 0;
}
