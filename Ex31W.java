package estrutura_repeticao;

import java.util.Scanner;

public class Ex31W {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
					int num;
					int i = 0;
					int a = 1;
					int b = 0;
					int aux;
					
					System.out.printf("Digite at� qual casa voc� gostaria de saber da sequ�ncia: ");
					num = ler.nextInt();
					
					while (num <= 0) {
						System.out.printf ("Erro, n�mero negativo! Digite um n�mero positivo: ");
						num = ler.nextInt();
					}

					while (i <= num) {
						System.out.println(a);
						aux = a;
						a = a + b;     
						b = aux;
						i++;
					}
				}
			}
		}
