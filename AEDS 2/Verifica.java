import java.util.*;

public class Verifica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arrayIns = new int[n/2];
            int[] arrayDel = new int[n/2];
            int qntIns = 0;
            int qntDel = 0;
	    int maior = 0;

            for (int i = 0; i < n; i++) {
                int op = sc.nextInt();
                int num = sc.nextInt();
                if (op == 1) {
                    arrayIns[qntIns++] = num;
		    if(maior > num){
			    maior = num;
		    }
                } else {
                    arrayDel[qntDel++] = num;
                }
            }

            int pilha = 0;
            int fila = 0;
	    int filap = 0;

           
		   for (int i = 0; i < qntDel ; i++) {
                    if (arrayIns[i] == arrayDel[i]) {
                        fila++;
			System.out.println(fila);
                    }
                }
            
	   
		for(int i = 0; i < qntDel; i++){
			if(arrayDel[i] >= maior){
				filap++;
				maior = arrayDel[i];
			}

		}

                for (int i = 0; i < qntDel; i++) {
                    if (arrayIns[i] == arrayDel[qntDel - i - 1]) {
                        pilha++;
                    
		    }

                }
            
            if (fila == qntDel) {
                System.out.println("queue");
            } else if (pilha == qntDel) {
                System.out.println("stack");
            } else {
                System.out.println("impossible");
            
	    }
        	if (filap == qntDel) {
			                System.out.println("queue pririo");
					            }
	}

        sc.close();
    }
}
