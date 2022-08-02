package aulas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TestesDiversos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		/*int votoBranco, votoNulo, lulaMolusco, bolsoNelson, ciloucaGomes, bolosBolinho;
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
				}else if (contVotacao.equals("2")){
					System.out.println("\nFinalizando Votação!");
				}
				else {
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
		}else {
			System.out.println("Votação não iniciada");
		}*/
	
		
		
		/*double[] notas = new double[4];
		double media = 0;
		
		for(int i = 0 ; i < 4; i++) {
			System.out.printf("Digite a %dª nota: ", (i+1));
			notas[i] = scan.nextDouble();
		}
		for (double nota : notas) {
			System.out.print(nota + ", ");
		}
			
		media = (notas[0] + notas[1] + notas [2] + notas[3]) / 4;
		System.out.printf("\n %.2f é o valor da media das notas.", media);*/

		/*int contador = 0;
		int contador2 = 0;
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("O i agora valendo " + i);
			contador++;
			System.out.println("O contador agora está valendo " + contador);	
			contador2 = contador2 + 1;
			System.out.println("O contador2 agora está valendo " + contador2);
		}*/
		
		/*ArrayList<String> lista = new ArrayList<>();
		lista.add("Luan");
		lista.add("Weslei");
		lista.add("Adrielly");
		lista.add("Gabriel");
		
		System.out.println(lista.get(2));
		
		for(String nomesNaLista : lista) {
			System.out.println("\n" + nomesNaLista);
		}*/
		/*double a = 0;
		double b = 0;
		double c = 0;
		
		System.out.println("\n\nRepresentação da equação de segundo grau: ax² + bx + c = 0.");
		System.out.print("Digite o valor de A: ");
		a = scan.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = scan.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = scan.nextDouble();
		
		System.out.println(Delta(a, b, c));
		System.out.println(X1(a, b, c));
		System.out.println(X2(a, b, c));
		
		scan.close();*/
	/*}
	public static double Delta(double a, double b, double c) {
		return (double) Math.pow(b, 2) - 4 * a * c;
	}*/
	/*public static double X1(double a, double b, double c) {
		if(Delta(a, b, c) < 0) {
			return 0.0;
		}else {
			return (-b + Math.sqrt(Delta(a, b, c))) / (2 * a);
		}		
	}*/
	/*public static double X2(double a, double b, double c) {		
		if(Delta(a, b, c) < 0) {
			return 0.0;
		}else {
			return (-b - Math.sqrt(Delta(a, b, c))) / (2 * a);
		}
	}*/
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	double a = 0.0;
	double b = 0.0;
	double c = 0.0;

	System.out.print("Entre com o valor de A: ");
	a = sc.nextDouble();
	System.out.print("Entre com o valor de B: ");
	b = sc.nextDouble();
	System.out.print("Entre com o valor de C: ");
	c = sc.nextDouble();

	FsegundoGrau(a, b, c);

	sc.close();

}

	public static void FsegundoGrau(double a, double b, double c) {
		
		double delta = (Math.pow(b, 2)) - (4 * (a * c));
		double x1 = 0.0;
		double x2 = 0.0;
		
		if(delta < 0) {
			System.out.println("Delta não tem raiz");
		}else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
		}
		
		System.out.printf("Delta está valendo: %.2f", delta);
		System.out.printf("\nx1 está valendo: %.2f", x1);
		System.out.printf("\nx2 está valendo: %.2f", x2);
		
		double verificao1 = (a * Math.pow(x1, 2) + b * x1 + c);
		double verificao2 = (a * Math.pow(x2, 2) + b * x2 + c);
		if (verificao1 != 0 || verificao2 != 0) {
			System.out.printf("\n\n%.0fx² + %.0fx + %.0f = 0", a, b, c);
			System.out.println("\n\nEssa equação está incorreta!");
		}else {
			System.out.printf("\n\n%.0fx² + %.0fx + %.0f = 0", a, b, c);
			System.out.printf("\n\nUtilizando X = %.2f, o resultado da Equação de Segundo Grau é igual a: %.2f", x1, verificao1);
			System.out.printf("\nUtilizando X = %.2f, o resultado da Equação de Segundo Grau é igual a: %.2f", x2, verificao2);
		}
	}
}
