package estudos;

import java.util.Arrays;

public class Exercicio_4_desafios_array {

	public static void main(String[] args) {
		
		int[] primeiro = {20,17,22,18,36,57,33};
		int[] priReverso = new int [7];
		int[] priRefeito = new int [7];
		System.out.print("Primerio Array reversos: ");
		for(int a=6; a>=0; a--) {
			System.out.print(primeiro[a]+" ");
		}
		System.out.println();
		
		System.out.print("Segundo Array priReverso: ");
		for(int b = 0; b < 7; b++) {
			priReverso[b] = primeiro[7 - 1 - b];
			System.out.print(priReverso[b]+" ");
		}
		System.out.println();
		
		Arrays.sort(priReverso);
	    System.out.print("priReverso crescente (com sort): ");
	    for (int num : priReverso) {
	    	System.out.print(num + " ");
	     }
	    System.out.println();
	    
	    bubbleSort(priReverso);
        System.out.print("priReverso crescente (sem sort): ");
        for (int num : priReverso) {
            System.out.print(num + " ");
        
        }
	}

	private static void bubbleSort(int[] priReverso) {
		
	}

}