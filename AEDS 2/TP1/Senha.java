import java.util.*;

public class Senha { // Abre a classe

    // Adicionei 'static' para o main conseguir chamar diretamente
    public static boolean Verifica(String senha) {
        boolean maiscula = false;
        boolean minuscula = false;
        boolean num = false;
        boolean spc = false;

        if (senha.length() >= 8) {
		// verifica se tem mais de 8 caracteres
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
		// verifica se há cada um dos tipos necesssarios de caractere
                if (c >= 'A' && c <= 'Z') {
                    maiscula = true;
                } else if (c >= 'a' && c <= 'z') {
                    minuscula = true;
                } else if (c >= '0' && c <= '9') {
                    num = true;
                } else {
                    if (c != ' ') { 
                        spc = true;
                    }
                }
            }
        }
	// retorna true se todos forem verdade
        return (maiscula && minuscula && num && spc);
    }

    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;

        if (sc.hasNextLine()) {
            texto = sc.nextLine();
            while (!isFim(texto)) {
                if (Verifica(texto)) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }
                texto = sc.nextLine();
            }
        }
        sc.close();
    }
} 
