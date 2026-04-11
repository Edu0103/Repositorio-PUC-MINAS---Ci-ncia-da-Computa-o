import java.util.*;
public class SubRecursiva{
	
	public static void Inverte(String str, int n){
		if(n < 0){
		return;}
		else{
		System.out.print(str.charAt(n));
		Inverte(str,n-1);
		}	

} 

    public static boolean isFim(String s) {
	            return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
		        }



	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			String texto = sc.nextLine();
			while(sc.hasNextLine()){
				
				Inverte(texto,texto.length() - 1);
				System.out.print("\n");
				texto = sc.nextLine();
						
						}


sc.close();


	}
}
