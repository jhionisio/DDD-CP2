package estrutura_repeticao;

import java.util.Scanner;

public class Ex28D {

	public static void main(String[] args) {
		 try (Scanner ler = new Scanner(System.in)) {
				int num, t;
	      
				do {
					t = 100 * (100 + 1);
					num = t / 2;
				}
				while(num != 5050);
				
				System.out.printf("Soma dos n�meros inteiros positivos do intervalo de um a cem: %d", num);
			}
	    }
	}

