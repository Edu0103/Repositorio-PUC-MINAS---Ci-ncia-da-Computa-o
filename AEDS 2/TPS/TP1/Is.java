import java.util.*;

public class Is {

	    public static boolean ehVogal(String palavra) {
		            int cont = 0;
			            String texto = palavra.toUpperCase();
				            for (int i = 0; i < palavra.length(); i++) {
						                char c = texto.charAt(i);
								            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
										                    cont++;
												                }
									            }
					            if(cont == palavra.length()){

							return true;
							
						    }
						    else{
							return false;
						    }
						        }

	        public static boolean ehConsoante(String palavra) {
			        int cont = 0;
				        String texto = palavra.toUpperCase();
					        for (int i = 0; i < palavra.length(); i++) {
							            char c = texto.charAt(i);
								                if ((c>='A' && c<='Z') && !(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
											                cont++;
													            }
										        }
						         if(cont == palavra.length()){

								        return true;
  
																                                                     }
							  else{
									return false;
	                                                 																				                                                    }
							    }

		public static boolean ehInteiro(String palavra) {

	int cont = 0;
	
	 for (int i = 0; i < palavra.length(); i++) {
	char c = palavra.charAt(i);
	if(c < 'A' && c != '.'){
	cont++;


	}	




	 }



				if(cont == palavra.length()){
													
	                         return true;

						                                                                                                                                                                                     }
				else{	
					return false;
										
				}




		}




		public static boolean ehFloat(String palavra) {



  int cont = 0;
  int contPnt = 0;
           for (int i = 0; i < palavra.length(); i++) {
		           char c = palavra.charAt(i);


	 if(c < 'A' )
	 {
		 if(c == '.'){

		cont++;
		contPnt++;

		 }
		 else{

		cont++;

		 }
			

			         }


		}

  if(cont == palavra.length() && contPnt == 1){

	                                   return true;


					                       }
                                  else{
					                                          return false;

										                                  }


		}


		public static void main(String[] args) {
			            Scanner sc = new Scanner(System.in);
				            
		String texto = sc.nextLine();
								          

		if(ehVogal(texto) == true){
		System.out.println("SIM");


		}
		else{
			System.out.println("NÃO");
		}
		if(ehConsoante(texto) == true){
                System.out.println("SIM");


                }
                else{
	                        System.out.println("NÃO");
		                }		
		if(ehInteiro(texto) == true){
			                System.out.println("SIM");


					                }
		                else{
					                                System.out.println("NÃO");
									                                }
												            
if(ehFloat(texto) == true){
                                        System.out.println("SIM");


				                                                        }
                                else{
					                                                                        System.out.println("NÃO");
														                                                                                                        }
					            
					            sc.close();
						        }
}
