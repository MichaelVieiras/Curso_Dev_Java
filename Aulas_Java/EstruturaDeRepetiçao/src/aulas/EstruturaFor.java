package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Estrutura FOR");
		//Usamos quando já sabemos a quantidade de vezes que precisamos executar determinado bloco de código
		for (int contador = 0; contador <= 10; contador++) {
			System.out.println("O contador For está valendo: " + contador);
		}
		
		System.out.println("\nEstrutura WHILE");
		//Usamos quando não sabemos a quantidade de vezes que precisamos executar determinado bloco de código
		int i = 0;
		while (i <= 10) {
			System.out.println("O contador do While está valendo: " + i);
			i++;
		}
		
		System.out.println("\nEstrutura DO WHILE");
		//Usamos quando queremos que o bloco de código seja executado ao menos uma vez;
		int cont = 0;
		do {
			System.out.println("O contador do Do While está valendo: " + cont);
			cont++;
		}while(cont <= 10);
		
		System.out.println("\nOutros Exemplos\n");
		
		int condicao = 0;
		int somar = 0;
		System.out.print("Entre com o numero 1 para sim e 2 para não: ");
		condicao = scan.nextInt();
		
		/*while(condicao == 1) {
			System.out.println("Apertou 1");
			System.out.print("Entre com o numero 1 para sim e 2 para não: ");
			condicao = scan.nextInt();
			somar++;
		}*/
		do {
			System.out.print("Entre com o numero 1 para sim e 2 para não: ");
			condicao = scan.nextInt();
		}while(condicao == 1);
		
		System.out.println("Saiu do bloco de repetição!");
		
		scan.close();
	}

}
