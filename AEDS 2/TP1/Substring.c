#include <stdio.h>

int substring(char txt[100]){
int cont = 0;
int length = 0;
char compara[100] = {0};
int pos = 0;
int maior = 0;

	for(int i = 0; txt[i] != '\0';i++){
// PEGA O TAMANHO DA STRING
	length++;

} 


	        for(int i = 0; i < length; i++){

                for(int j = 0; j < pos; j++){

                        if(compara[j] == txt[i]){
				// compara se o caractere atual ja aareceu
                                if(pos > maior){

                                maior = pos;

                                }

				cont = pos;
				// reseta o array 
                                pos = 0 ;

                                for(int k = j+1; k < cont; k++){
					// pega apenas as letras apos da repetida
                                        compara[pos] = compara[k];

                                        pos++;



                                }

                                
				// encerra o for
				j = 100;

                        }

                                            }
		//insere a letra atual no final
               compara[pos] = txt[i];
	       pos++;
	   	
	
						


}


	
	

	if(pos > maior){
	return pos;
	}
	else{
		return maior;
	}

}






int main(){


	char txt[100];
	scanf("%s",txt);
	while(!(txt[0]=='F'&& txt[1]=='I' && txt[2]=='M')){

	printf("%d\n",substring(txt));
	scanf("%s", txt);



}






}
