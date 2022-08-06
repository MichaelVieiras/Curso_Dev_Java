package torneio;

import java.util.Locale;
import java.util.Scanner;

import heroi.Heroi;

import vilao.Vilao;


public class TorneioDoPoder {

	public static void main(String[] args) {
		
		

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Heroi heroi = new Heroi();
		Vilao vilao = new Vilao();
		int cadastro = 0;
		
		System.out.println("Seja Bem-Vindo ao Torneio dos Poderes");
		System.out.println("\nTodos os Universos estão sendo ameaçados pelo grande e maléfico L MURAK, que deseja obter todo o conhecimento existente para si. Para evitar o monopólio do conhecimento todos os Heróis e Vilões decidiram lutar contra ele, porém há uma única condição para enfrenta-lo, somente o mais forte tem o direito de desafia-lo. Devido a essa condição específica foi montado um torneio para eleger o mais forte de todos. De um lado os Heróis que desejam que o conhecimento seja livre para todos, do outro lado os Vilões que deseja se aproveitarem do conhecimento e espalhar o caos sobre o universo.\n");
		System.out.println("####################REGRAS####################");
		System.out.println("1 - Será necessário o cadastro de 8 candidatos, sendo 4 Vilões e 4 Heróis. Todos possuem um registro de sua origem ");
		System.out.println("2 - Teremos 2 grupos: Herois vs Vilões.");
		System.out.println("3 - A luta será 1 vs 1. O último que restar tem o direito do desafio.");
		System.out.println("5 - Cadidato que não está na Ativa podem ter um buff ou debuff.");
		
		
		System.out.print("\n\nDeseja inciar o cadastro | 1 - Sim | 2 - Não |: ");
		cadastro = scan.nextInt();
		
		Cadastro(cadastro);
		
		System.out.println("Primeira Luta");
		
		
		scan.close();
	}
	public static  void Cadastro(int cadastro) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Heroi heroi = new Heroi();        
        Vilao vilao = new Vilao();
        
		for (int i = 0; i < 2; i++) {
			if (cadastro == 1) {
				System.out.println("Deseja iniciar o cadastro do (1 - Herói) ou (2 - Vilão): ");
				int opcao = scan.nextInt();
				if(opcao == 1) {
					
					scan.nextLine();
					System.out.print("\nIdentidade Secreta do Herói: ");
					String identidadeSecreta = scan.nextLine();
					heroi.setIdentidadeSecreta(identidadeSecreta);
					
					System.out.print("Universo a qual pertece: ");
					String universoPertence = scan.nextLine();
					heroi.setUniversoPertence(universoPertence);
					
					System.out.print("Nome de Herói: ");
					String nomeDeHeroi = scan.nextLine();
					heroi.setNomeDeHeroi(nomeDeHeroi);
					
					System.out.print("Planeta Natal: ");
					String planetaNatal = scan.nextLine();
					heroi.setPlanetaNatal(planetaNatal);
					
					System.out.print("Pertece ao qual Grupo: ");
					String pertenceAoGrupoLiga = scan.nextLine();
					heroi.setPertenceAoGrupoLiga(pertenceAoGrupoLiga);
					
					System.out.print("Cidade Natal: ");
					String cidadeNatal = scan.nextLine();
					heroi.setCidadeNatal(cidadeNatal);
					
					System.out.print("Base Secreta: ");
					String baseSecreta = scan.nextLine();
					heroi.setBaseSecreta(baseSecreta);
					
					System.out.print("Super Poderes: ");
					String superPoderes = scan.nextLine();
					heroi.setSuperPoderes(superPoderes);
					
					System.out.print("Idade: ");
					int idade = scan.nextInt();
					heroi.setIdade(idade);
					
					//System.out.print("Esta na Ativa ainda: ");
					//boolean estaNaAtiva  = scan.nextBoolean();
					//heroi.setEstaNaAtiva(estaNaAtiva);
					
					
					
				}else if(opcao == 2) {
					scan.nextLine();
					System.out.print("\nIdentidade Secreta do Vilão: ");
					String identidadeSecreta = scan.nextLine();
					vilao.setIdentidadeSecreta(identidadeSecreta);
					
					System.out.print("Universo a qual pertece: ");
					String universoPertence = scan.nextLine();
					vilao.setUniversoPertence(universoPertence);
					
					System.out.print("Nome de Vilão: ");
					String nomeDeVilao = scan.nextLine();
					vilao.setNomeDeVilao(nomeDeVilao);
					
					System.out.print("Planeta Natal: ");
					String planetaNatal = scan.nextLine();
					vilao.setPlanetaNatal(planetaNatal);
					
					System.out.print("Pertece ao qual Grupo: ");
					String pertenceAoGrupoLiga = scan.nextLine();
					vilao.setPertenceAoGrupoLiga(pertenceAoGrupoLiga);
					
					System.out.print("Cidade Natal: ");
					String cidadeNatal = scan.nextLine();
					vilao.setCidadeNatal(cidadeNatal);
					
					System.out.print("Base Secreta: ");
					String baseSecreta = scan.nextLine();
					vilao.setBaseSecreta(baseSecreta);
					
					System.out.print("Super Poderes: ");
					String superPoderes = scan.nextLine();
					vilao.setSuperPoderes(superPoderes);
					
					System.out.print("Idade: ");
					int idade = scan.nextInt();
					vilao.setIdade(idade);
					
					//System.out.print("Está na ativa ainda: ");
					//boolean estaNaAtiva  = scan.nextBoolean();
					//vilao.setEstaNaAtiva(estaNaAtiva);
					
					
				}
				
			}else {
				System.out.println("Até quando pretende deixar o Universo sofrer????");
			}
		}	
		
		System.out.println("\nGrupo dos Vilões: ");
		System.out.println(vilao);
		
		System.out.println("\nGrupo dos Heróis: ");
		System.out.println(heroi);
		
		

		scan.close();
	}
	
}
