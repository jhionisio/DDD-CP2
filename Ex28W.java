package estrutura_repeticao;

import java.util.Scanner;

public class Ex28W {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in)) {
			int num, t;
			t = 100 * (100 + 1);
			num = t / 2;
			
			System.out.printf("Soma dos n�meros inteiros positivos do intervalo de um a cem: ");
			while (num != 5050) {		
				System.out.printf("Erro!");
			}
			
			System.out.printf("\nA soma � de: %d", num);
			
		}
	}
}
