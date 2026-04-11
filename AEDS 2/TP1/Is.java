import java.util.*;

public class Is {

    // Função para comparar se a String é "FIM" 
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean ehVogal(String palavra) {
        // funcao para verificar Vogal
        int cont = 0;
        String texto = palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u') {
                // verifica se sao apenas vogais no texto
                cont++;
            }
        }
        if (cont == palavra.length()) {
            //verifica se o contador de caracteres validos e o mesmo tamanho do texto, pois se for o texto apenas possui vogais
            return true;

        } else {
            return false;
        }
    }

    public static boolean ehConsoante(String palavra) {
        // funcao para verificar Vogal
        int cont = 0;
        String texto = palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            char c = texto.charAt(i);
            if (((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) && !(c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                // verifica se sao apenas consoantes no texto
                cont++;
            }
        }
        if (cont == palavra.length()) {

            //verifica se o contador de caracteres validos e o mesmo tamanho do texto, pois se for o texto apenas possui consoantes
            return true;

        } else {
            return false;
        }
    }

    public static boolean ehInteiro(String palavra) {
        // funcao para numero inteiro
        int cont = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c >= '0' && c <= '9') {
                // verifica se sao apenas numeros no texto
                cont++;
            }

        }

        if (cont == palavra.length()) {

            //verifica se o contador de caracteres validos e o mesmo tamanho do texto, pois se for o texto e um numero inteiro
            return true;
        } else {
            return false;

        }

    }

    public static boolean ehFloat(String palavra) {
        // funcao para numero float
        int cont = 0;
        int contPnt = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (c >= '0' && c <= '9') { // verifica se sao apenas numeros e se possui ponto ou virgula
                cont++;
                
            } 
            else if (c == '.' || c == ',') {
                cont++;
                contPnt++;
            }

        }

        // AJUSTE: contPnt <= 1 (pois números inteiros também são números reais válidos)
        if (cont == palavra.length() && contPnt <= 1) {
            // alem de verificar o tamanho, verifica se possui apenas uma representacao de separacao de casas decimais, se o contador de caracteres validos for o mesmo tamanho do texto, o texto e um numero real
            return true;

        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String texto = sc.nextLine();

            if (isFim(texto)) {
                break; 
            }

            // Vogal
            if (ehVogal(texto))
                System.out.print("SIM ");
            else
                System.out.print("NAO ");

            // Consoante
            if (ehConsoante(texto))
                System.out.print("SIM ");
            else
                System.out.print("NAO ");

            // Inteiro
            if (ehInteiro(texto))
                System.out.print("SIM ");
            else
                System.out.print("NAO ");

            // Float
            if (ehFloat(texto))
                System.out.print("SIM");
            else
                System.out.print("NAO");

            System.out.println();
}
        

        sc.close();
    }

}
