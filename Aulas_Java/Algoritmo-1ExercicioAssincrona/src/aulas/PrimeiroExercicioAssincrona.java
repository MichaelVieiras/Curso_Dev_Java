package aulas;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExercicioAssincrona {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		/*
		 * Estamos em ano de eleições. A empresa "Dados Incertos" precisa fazer uma
		 * pesquisa de intenção de votos para divulgar no jornal do meio dia
		 * "Jornal da meia noite ao meio dia, segunda edição". Os candidatos são: Lula
		 * Molusco, da feira do biquíni, perdeu um tentáculo em acidente da indústria
		 * que trabalha. Bolso Nelson, dizem que cuida dos fazendeiros e muitas cabeças
		 * de gado. Cilouca Gomes, pela volta do coronelismo no brasil,
		 * "O tempo do café com leite que era bom". Bolos Bolinho, parece que
		 * confeitaria é sua profissão mas na verdade ele atua no ramo imobiliário. Crie
		 * as variáveis necessárias para contar a quantidade de votos que cada candidato
		 * possui e mostre na tela. Use a estrutura de repetição que achar melhor para
		 * essa atividade.
		 */

		/*int votoBranco, votoNulo, lulaMolusco, bolsoNelson, ciloucaGomes, bolosBolinho;
		votoBranco = votoNulo = lulaMolusco = bolsoNelson = ciloucaGomes = bolosBolinho = 0;
		int numCandidato = 0;
		int qtdEleitores = 0;
		String iniciarVotacao;

		System.out.println("Dados Incertos: Jornal da Meia Noite ou Meio Dia");
		System.out.println("####Pesquisa intenção de Votos Eleições 2022####\n");

		System.out.println("########Candidatos#######");
		System.out.println("## 12 - Bolos Bolinho  ##");
		System.out.println("## 13 - Bolso Nelson   ##");
		System.out.println("## 17 - Lula Molusco   ##");
		System.out.println("## 50 - Cilouca Gomes  ##");
		System.out.println("## 0 - Voto em Branco  ##");
		System.out.println("#########################");

		System.out.print("Deseja iniciar a votação 1-SIM ou 2-NÃO: ");
		iniciarVotacao = scan.nextLine();
		if (iniciarVotacao.equals("1") || iniciarVotacao.equals("SIM") || iniciarVotacao.equals("sim")
				|| iniciarVotacao.equals("s") || iniciarVotacao.equals("S")) {
			System.out.print("Informe a quantidade de Eleitores: ");
			qtdEleitores = scan.nextInt();
			for (int i = 1; i <= qtdEleitores; i++) {
				System.out.print("\nInforme o número do Candidato: ");
				numCandidato = scan.nextInt();
				switch (numCandidato) {
				case 0:
					System.out.println("Você votou em Branco!");
					votoBranco++;
					break;
				case 12:
					System.out.println("Você votou no Bolos Bolinho!");
					bolosBolinho++;
					break;
				case 13:
					System.out.println("Você votou no Bolso Nelson!");
					bolsoNelson++;
					break;
				case 17:
					System.out.println("Você votou no Lula Molusco!");
					lulaMolusco++;
					break;
				case 50:
					System.out.println("Você votou na Cilouca Gomes!");
					ciloucaGomes++;
					break;
				default:
					System.out.println("Você votou Nulo!");
					votoNulo++;
					break;
				}
			}
			System.out.println("\nResultado das intenções de votos!\n");
			System.out.println("#########Resultado#########");
			System.out.printf("## 12 - Bolos Bolinho: %d ##\n", bolosBolinho);
			System.out.printf("## 13 - Bolso Nelson: %d  ##\n", bolsoNelson);
			System.out.printf("## 17 - Lula Molusco: %d  ##\n", lulaMolusco);
			System.out.printf("## 50 - Cilouca Gomes: %d ##\n", ciloucaGomes);
			System.out.printf("## 0 - Voto em Branco: %d ##\n", votoBranco);
			System.out.printf("##     Voto Nulo: %d      ##\n", votoNulo);
			System.out.println("###########################");

		} else {
			System.out.println("Votação não iniciada");
		}*/

		int votoBranco, votoNulo, lulaMolusco, bolsoNelson, ciloucaGomes, bolosBolinho;
		votoBranco = votoNulo = lulaMolusco = bolsoNelson = ciloucaGomes = bolosBolinho = 0;
		int numCandidato = 0;
		String contVotacao;
		String iniciarVotacao;

		System.out.println("Dados Incertos: Jornal da Meia Noite ou Meio Dia");
		System.out.println("####Pesquisa intenção de Votos Eleições 2022####\n");

		System.out.println("########Candidatos#######");
		System.out.println("## 12 - Bolos Bolinho  ##");
		System.out.println("## 13 - Bolso Nelson   ##");
		System.out.println("## 17 - Lula Molusco   ##");
		System.out.println("## 50 - Cilouca Gomes  ##");
		System.out.println("## 0 - Voto em Branco  ##");
		System.out.println("#########################");

		System.out.print("Deseja iniciar a votação 1-SIM ou 2-NÃO: ");
		iniciarVotacao = scan.nextLine();

		if (iniciarVotacao.equals("1") || iniciarVotacao.equals("SIM") || iniciarVotacao.equals("sim")
				|| iniciarVotacao.equals("s") || iniciarVotacao.equals("S")) {
			do {
				System.out.print("\nInforme o número do Candidato: ");
				numCandidato = scan.nextInt();
				switch (numCandidato) {
				case 0:
					System.out.println("Você votou em Branco!");
					votoBranco++;
					break;
				case 12:
					System.out.println("Você votou no Bolos Bolinho!");
					bolosBolinho++;
					break;
				case 13:
					System.out.println("Você votou no Bolso Nelson!");
					bolsoNelson++;
					break;
				case 17:
					System.out.println("Você votou no Lula Molusco!");
					lulaMolusco++;
					break;
				case 50:
					System.out.println("Você votou na Cilouca Gomes!");
					ciloucaGomes++;
					break;
				default:
					System.out.println("Você votou Nulo!");
					votoNulo++;
					break;
				}
				scan.nextLine();
				System.out.print("\nContinuar Votação 1-SIM ou 2-NÃO: ");
				contVotacao = scan.nextLine();
				if (contVotacao.equals("1")) {
					System.out.println("\nContinuando Votação!");
				} else if (contVotacao.equals("2")) {
					System.out.println("\nFinalizando Votação!");
				} else {
					while (contVotacao != ("1") || contVotacao != ("2")) {
						System.out.print("\nContinuar Votação 1-SIM ou 2-NÃO: ");
						contVotacao = scan.nextLine();
						if (contVotacao.equals("1") || contVotacao.equals("2")) {
							break;
						}
					}
				}
			} while (contVotacao.equals("1") || contVotacao.equals("SIM") || contVotacao.equals("sim")
					|| contVotacao.equals("s") || contVotacao.equals("S"));
			System.out.println("\nResultado das intenções de votos!\n");
			System.out.println("#########Resultado#########");
			System.out.printf("## 12 - Bolos Bolinho: %d ##\n", bolosBolinho);
			System.out.printf("## 13 - Bolso Nelson: %d  ##\n", bolsoNelson);
			System.out.printf("## 17 - Lula Molusco: %d  ##\n", lulaMolusco);
			System.out.printf("## 50 - Cilouca Gomes: %d ##\n", ciloucaGomes);
			System.out.printf("## 0 - Voto em Branco: %d ##\n", votoBranco);
			System.out.printf("##     Voto Nulo: %d      ##\n", votoNulo);
			System.out.println("###########################");
		} else {
			System.out.println("Votação não iniciada");
		}

		scan.close();
	}

}
