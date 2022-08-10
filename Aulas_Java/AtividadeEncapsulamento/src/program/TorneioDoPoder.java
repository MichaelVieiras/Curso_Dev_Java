package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;
import entities.Dado;





public class TorneioDoPoder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Cadastro cadastro = new Cadastro();
		Dado dado = new Dado();
		
		
		System.out.println("Seja Bem-Vindo ao Torneio dos Poderes");
		System.out.println("\nTodos os Universos estão sendo ameaçados pelo grande e maléfico L MURAK, que deseja obter todo o conhecimento existente para si. Para evitar o monopólio do conhecimento todos os Heróis e Vilões decidiram lutar contra ele, porém há uma única condição para enfrenta-lo, somente o mais forte tem o direito de desafia-lo. Devido a essa condição específica foi montado um torneio para eleger o mais forte de todos. De um lado os Heróis que desejam que o conhecimento seja livre para todos, do outro lado os Vilões que deseja se aproveitarem do conhecimento e espalhar o caos sobre o universo.\n");
		System.out.println("####################REGRAS####################");
		System.out.println("1 - Será necessário o cadastro de 8 candidatos, sendo 4 Vilões e 4 Heróis. Todos possuem um registro de sua origem ");
		System.out.println("2 - Teremos 2 grupos: Herois vs Vilões.");
		System.out.println("3 - A luta será 1 vs 1. O último que restar tem o direito do desafio.");
		System.out.println("5 - Cadidato que não está na Ativa podem ter um buff ou debuff.");
		
		
		System.out.print("\n\nDeseja inciar o cadastro | 1 - Sim | 2 - Não |: ");
		cadastro.Cadastro(scan.nextInt());
		
		
		System.out.println("Primeira Luta");
		
	
		System.out.println("Deseja lançar o dado | 1 - Sim | 2 - Não |: ");
		dado.Dado(scan.next().charAt(0));
		
		
		scan.close();
	}
}
