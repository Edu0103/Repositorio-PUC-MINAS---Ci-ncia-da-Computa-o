#include <stdio.h>

//verifica se e vogal
int ehVogal(char palavra[100]) {
    if (*palavra == '\0') return 1;
    if (!(*palavra == 'A' || *palavra == 'E' || *palavra == 'I' || *palavra == 'O' || *palavra == 'U' || 
          *palavra == 'a' || *palavra == 'e' || *palavra == 'i' || *palavra == 'o' || *palavra == 'u')) {
        return 0;
    }
    return ehVogal(palavra + 1);
}
//verifica se e consoante
int ehConsoante(char palavra[100]) {
    if (*palavra == '\0') return 1;
    if (!(((*palavra >= 'A' && *palavra <= 'Z') || (*palavra >= 'a' && *palavra <= 'z')) && 
        !(*palavra == 'A' || *palavra == 'E' || *palavra == 'I' || *palavra == 'O' || *palavra == 'U' || 
          *palavra == 'a' || *palavra == 'e' || *palavra == 'i' || *palavra == 'o' || *palavra == 'u'))) {
        return 0;
    }
    return ehConsoante(palavra + 1);
}
//verifica se e inteiro
int ehInteiro(char palavra[100]) {
    if (*palavra == '\0') return 1;
    if (!(*palavra >= '0' && *palavra <= '9')) return 0;
    return ehInteiro(palavra + 1);
}
//verifica se e real
int ehRealRecursivo(char palavra[100], int contPontos) {
    if (*palavra == '\0') return 1; 
    if (*palavra >= '0' && *palavra <= '9') return ehRealRecursivo(palavra + 1, contPontos);
    if (*palavra == '.' || *palavra == ',') {
        if (contPontos == 0) return ehRealRecursivo(palavra + 1, 1);
        else return 0;
    }
    return 0;
}

int ehReal(char palavra[100]) {
    return ehRealRecursivo(palavra, 0);
}


int main() {
    char txt[1000];

    while (fgets(txt, 1000, stdin) && !(txt[0] == 'F' && txt[1] == 'I' && txt[2] == 'M' && (txt[3] == '\0' || txt[3] == '\n' || txt[3] == '\r'))) {
        
        for (int i = 0; txt[i] != '\0'; i++) {
            if (txt[i] == '\n' || txt[i] == '\r') {
                txt[i] = '\0';
                i--;
            }
        }


        if (ehVogal(txt) == 1) {
            printf("SIM ");
        } else {
            printf("NAO ");
        }

        if (ehConsoante(txt) == 1) {
            printf("SIM ");
        } else {
            printf("NAO ");
        }

        if (ehInteiro(txt) == 1) {
            printf("SIM ");
        } else {
            printf("NAO ");
        }

        if (ehReal(txt) == 1) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }

    return 0;
}