package estrutura_repeticao;

import java.util.Scanner;

public class Ex29D {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int num, i;
			int a = 1;
			int b = 0;
			int aux;
      
			do {
			    System.out.printf("Digite at� qual casa voc� gostaria de saber na sequ�ncia de Fibonacci: ");
			    num = ler.nextInt();
			}
			while(num <= 0);
      
			i = 0;
			do {
			    System.out.println(a);
			    aux = a;
			    a = a + b;
			    b = aux;
			    i++;            
			}
			while (i <= num);
		}
    }
}

