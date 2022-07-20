package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US); /* .useLocale(Locale.US) utiliza o padrão US, ou seja, "." ao inves da ",". */
		
		String nome;
		int idade = 0;
		char sexo;
		double saldoBancario = 0;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite seu sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("Digite o saldo da sua conta R$: ");
		saldoBancario = leia.nextDouble();
		
		System.out.println("O Sr(a). " + nome + " tem " + idade + " anos, seu sexo é " + sexo + " e possui a fortuna de R$ " + saldoBancario + " reais no Banco.");
		
		
		leia.close();
	}

}
