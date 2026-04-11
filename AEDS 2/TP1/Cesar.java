import java.util.*;
public class Cesar{

	public static void Cifra(String txt){
	for(int i = 0; i < txt.length();i++){
			System.out.print((char)(txt.charAt(i) + 3));
			// converte cada caractere da string em cahr e soma 3, alterando o valor com base na tabela ascii

	}
System.out.print("\n");



	}

    public static boolean isFim(String s) {
	             return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
		        }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String texto = MyIO.readLine();
		while(!isFim(texto)){
				
				Cifra(texto);
				texto = MyIO.readLine();
						
						}
		



	sc.close();
	}
}
