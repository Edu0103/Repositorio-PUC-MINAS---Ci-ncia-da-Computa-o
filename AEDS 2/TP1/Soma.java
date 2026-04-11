import java.util.*;

public class Soma{
	public static int somaDigitos(int num){
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



public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }
	
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	int num;
	
	while(sc.hasNextInt()){
	num = sc.nextInt();
	System.out.println(somaDigitos(num));
    




}



sc.close();
	}
}
