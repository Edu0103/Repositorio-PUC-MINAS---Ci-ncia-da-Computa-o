#include <stdio.h>

void inverteTexto(char texto[100]){


	int c = 0;
	while(texto[c] != '\0'){
	c++;


	}


for(int i = c; i >= 0; i--){
	printf("%c", texto[i]);
}

}



int main(){

	char txt[100];
	scanf("%s",txt);

	inverteTexto(txt);








}
