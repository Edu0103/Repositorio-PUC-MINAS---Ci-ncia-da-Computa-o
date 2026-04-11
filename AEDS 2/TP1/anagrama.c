#include <stdio.h>

int Compara(char str1[], char str2[]){
int cont = 0;
int length1 = 0,length2 = 0;

// passa as letras todas para minusculas
for(int i = 0; str1[i] != '\0';i++){
	length1++;
if (str1[i] >= 'A' && str1[i] <= 'Z') {
          str1[i]+=32;
    }



}


for(int i = 0; str2[i] != '\0';i++){
	        length2++;
		if (str2[i] >= 'A' && str2[i] <= 'Z') {
			                 str2[i]+=32;
					                      }


}


if(length1 == length2){
	for(int i = 0; i < length1;i++){
		int achouLetra = 0;//variavel pra ver se acho a letra atual da segunda string na primeira
		for(int j = 0; j < length1; j++){
		
			if(achouLetra == 0 && str1[i] == str2[j]){
			// caso ache a letra atual da string2 e na 1 'apaga a letra' e modifica o contador
			cont++;
			str2[j] = '*';
			achouLetra = 1;
		}

		}
	}
}


	if(cont == length1){
return 1;
	}
else{

	return 0;
}


}

int main(){
char str1[100],str2[100];

scanf("%s %s",str1,str2);

while(!(str1[0]=='F'&& str1[1]=='I' && str1[2]=='M')){
	if(Compara(str1,str2) == 1){
			printf("SIM\n");
			}
	else{
			printf("NAO\n");
	}
scanf("%s %s",str1,str2);


}

}
