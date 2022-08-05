package cadastro;

import java.util.Locale;
import java.util.Scanner;

import heroi.Heroi;
import vilao.Vilao;

public class Cadastro {
	Scanner scan = new Scanner(System.in).useLocale(Locale.US);
	Heroi heroi = new Heroi();
	Vilao vilao = new Vilao();
	public int cadastro;
	public String ficha;

	public Cadastro() {

		for (int i = 0; i < 2; i++) {
			if (cadastro == 1) {
				System.out.println("Deseja iniciar o cadastro do (1 - Herói) ou (2 - Vilão): ");
				int opcao = scan.nextInt();
				if (opcao == 1) {

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

					// System.out.print("Esta na Ativa ainda: ");
					// boolean estaNaAtiva = scan.nextBoolean();
					// heroi.setEstaNaAtiva(estaNaAtiva);

				} else if (opcao == 2) {
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

					// System.out.print("Está na ativa ainda: ");
					// boolean estaNaAtiva = scan.nextBoolean();
					// vilao.setEstaNaAtiva(estaNaAtiva);

				}

			} else {
				System.out.println("Até quando pretende deixar o Universo sofrer????");
			}
		}
		scan.close();

	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public String getFicha() {
		return ficha;
	}

	public void setFicha(String ficha) {
		this.ficha = ficha;
	}

}
