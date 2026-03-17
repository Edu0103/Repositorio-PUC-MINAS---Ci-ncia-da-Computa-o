import java.util.*;
public class Alteracao{

	public static String alteraString(String str,Random gerador ){
	char letraOriginal = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
	                char letraSubstituta = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
	char[] texto = str.toCharArray();
	for(int i = 0; i < str.length();i++){

	if (texto[i] == letraOriginal) {
	 texto[i] = letraSubstituta;
	}

	}

	return new String(texto);
	}


	public static void main(String[] args){


	      Random gerador = new Random();
	        gerador.setSeed(4);
		



	Scanner sc = new Scanner(System.in);
	String texto;	
	texto = sc.nextLine();
	while(!texto.equals("FIM")){
	
	System.out.println(alteraString(texto,gerador));
	texto = sc.nextLine();
	
	}
	

	sc.close();

	}
}
