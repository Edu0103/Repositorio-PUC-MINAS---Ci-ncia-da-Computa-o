#include <stdio.h>



void Cifra(char txt[],int n){

	if(txt[n] == '\0'){
		return;
	}


	printf("%c",(txt[n]+3));

	Cifra(txt,n+1);


}



int main(){
char txt[1000];
while((fgets(txt, 1000, stdin)) && !(txt[0]=='F'&& txt[1]=='I' && txt[2]=='M')){
        
        // Limpeza do \n
    int i; 
	for(i = 0; txt[i] != '\0'; i++){
            if(txt[i] == '\n' || txt[i] == '\r'){
                txt[i] = '\0';
                i--;
            }
        }


Cifra(txt,0);
printf("\n");


}



}
