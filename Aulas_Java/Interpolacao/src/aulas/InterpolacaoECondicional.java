package aulas;

import java.util.Locale;
import java.util.Scanner;

public class InterpolacaoECondicional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		/*String nome = "Michael Vieira";
		int idade = 25;
		double salario = 1500.00;
		char sexo = 'M';
		
		// %s => String, %d => int, %.2f => formatação (double e float), %c => char
		System.out.printf("%s tem %d anos e ganha %.2f, sexo: %c", nome, idade, salario, sexo);
		*/
		
		
		System.out.println("##########################################");
		System.out.println("##   &&(E)     ##   ||(OU)    ##   !    ##");
		System.out.println("## V  | V => V ## V  | V => V ## V => F ##");
		System.out.println("## V  | F => F ## V  | F => V ## F => V ##");
		System.out.println("## F  | V => F ## F  | V => V ##        ##");
		System.out.println("## F  | F => F ## F  | F => F ##        ##");
		System.out.println("##########################################");
		
		/*double num1 = 0.0;
		double num2 = 0.0;
		
		System.out.print("Digite o primeiro número: ");
		num1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = scan.nextDouble();
		
		if (num1 > num2) {
			System.out.println("O número maior é o: " + num1);
		}else {
			System.out.println("O número maior é o: " + num2 + "\n");
		}*/
		
		int numero = 0;
		
		System.out.println("Entre com um numero: ");
		numero = scan.nextInt();
		
		switch (numero) {
		case 1: 
			System.out.println("Você digitou o numero 1!");
			break;
		case 2:
			System.out.println("Você digitou o numero 2!");
			break;
		default:
			System.out.println("Você digitou um numero maior que 2 ou você digitou uma letra!");
			break;
		}
		System.out.println("Saiu do Switch case!");
		scan.close();
	}

}
