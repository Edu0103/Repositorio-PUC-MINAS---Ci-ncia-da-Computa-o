import java.util.*;
public class Alteracao{

	    // Função para comparar se a String é "FIM" 
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

	public static char[] alteraString(String str,Random gerador ){
		// pega um caractere aleatorio a ser substituido e o que vai substituir
	char letraOriginal = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
	char letraSubstituta = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
	char[] texto = new char[str.length()];
	for(int i = 0; i < str.length();i++){
		// cria uma string com array de caracteres e verficia se o caractere atual será trocado
	if (str.charAt(i) == letraOriginal) {
	texto[i] = letraSubstituta;
	}
	else{
		texto[i] = str.charAt(i);
	}

	}

	return texto;
	}


	public static void main(String[] args){


	      Random gerador = new Random();
	        gerador.setSeed(4);
		



	Scanner sc = new Scanner(System.in);
	String texto;	
	texto = sc.nextLine();
	while(!isFim(texto)){
	
	System.out.println(alteraString(texto,gerador));
	texto = sc.nextLine();
	
	}
	

	sc.close();

	}
}
