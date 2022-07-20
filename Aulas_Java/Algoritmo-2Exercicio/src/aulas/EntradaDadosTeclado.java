package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US); /* .useLocale(Locale.US) utiliza o padrão US, ou seja, "." ao inves da ",". */
		
		String nome;
		int numero = 0;
		char sexo;
		double x = 10.25;
		
		System.out.println("Entre com um nome: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com um numero inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("x está valendo: " + x); /* println imprimi a mensagem e quebra uma linha. */
		
		System.out.print("Insira um valor para a variavel x: "); /* print imprimi a mensagem e não quebra a linha. */
		x = leia.nextDouble();
		
		
		System.out.println("\n" + "Nome: " + nome);
		System.out.println("Numero inteiro: " + numero);
		System.out.println("Sexo: " + sexo);
		System.out.println("O valor de x agora está valendo: " + x);
		
		
		leia.close();
	}

}
