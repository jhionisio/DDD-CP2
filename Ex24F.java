package estrutura_repeticao;

import java.util.Scanner;

public class Ex24F {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
					int num, i, t;
					
					System.out.printf("Digite o n�mero 5: ");
					num = ler.nextInt();
					
					while (num != 5) {
						System.out.printf("Erro, n�mero incompat�vel! Digite o n�mero 5: ");
						num = ler.nextInt();
					}
					
					for (i = 1; i <=10; i ++) {
						t = num * i;
						System.out.printf("\n%d X %d = %d", num, i, t);
					}
				} 	
			}
		}
