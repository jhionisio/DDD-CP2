package estrutura_repeticao;

import java.util.Scanner;

public class Ex22W {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        double numA, numB;
       
        System.out.printf("Digite o primeiro n�mero: ");
        numA = ler.nextDouble();
        
        System.out.printf("Digite o segundo n�mero: ");
        numB = ler.nextDouble();
        
        while(numB <= numA) {
            System.out.printf("Digite novamente o segundo n�mero: ");
            numB = ler.nextDouble();
        }
        System.out.printf("Segundo N�mero maior! ");

	}

}
