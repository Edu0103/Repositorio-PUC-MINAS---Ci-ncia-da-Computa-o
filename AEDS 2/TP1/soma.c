#include <stdio.h>
#include <stdlib.h>
int somaDigitos(int num){
	int sobra = 0;
	// Verifica se o valor atual da resto 1 ou 0 e se é o último algarismo
	if(num < 10){ 
		// retorna o último algarismo
		return num;}
	else{
		sobra = num % 10;
		//retorna o algarismo atual mais o próximo
		return sobra + somaDigitos(num/10);
	}


}

int main(){

	int num;
	while(scanf("%d",&num) != EOF){
	printf("%d\n",somaDigitos(num));
	}
	

}
