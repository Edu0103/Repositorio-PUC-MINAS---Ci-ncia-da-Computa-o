#include <stdio.h>


void inverteTexto(char texto[100]){

	int c = 0;
	while(texto[c] != '\0'){
		//pega o tamanho do texto atual
	c++;


	}


for(int i = c-1; i >= 0; i--){
	//printa ao contrario desde o último caractere sem ser o \0
	printf("%c", texto[i]);
}
printf("\n");
}



int main(){

	char txt[100];
	scanf(" %[^\n]",txt);
	while(!(txt[0]=='F'&& txt[1]=='I' && txt[2]=='M')){
	inverteTexto(txt);
	scanf(" %[^\n]",txt);	
	}


}
