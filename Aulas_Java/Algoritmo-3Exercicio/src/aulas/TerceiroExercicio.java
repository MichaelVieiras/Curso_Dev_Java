package aulas;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		//Faça um Programa que peça dois números e imprima a soma;
		double valor1, valor2;
		valor1 = 0;
		valor2 = 0;
		
		System.out.print("Digite um número: ");
		valor1 = leia.nextDouble();
		System.out.print("Digite outro número: ");
		valor2 = leia.nextDouble();
		System.out.print("O resultado da soma dos números é: " + (valor1 + valor2) + "\n");
		
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		double nota1, nota2, nota3, nota4, media;
		nota1 = 0.0;
		nota2 = 0.0;
		nota3 = 0.0;
		nota4 = 0.0;
		media = 0.0;
		
		System.out.print("\nInsira a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.print("Insira a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.print("Insira a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.print("Insira a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.print("A media bimestral é: " + media + "\n");
		
		//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		double salarioHora, horasTrabalhadas, salarioFinal;
		salarioHora = 0.0;
		horasTrabalhadas = 0.0;
		salarioFinal = 0.0;
		
		System.out.print("\nDigite o valor do salario por hora R$: ");
		salarioHora = leia.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadas = leia.nextDouble();
		
		salarioFinal = salarioHora * horasTrabalhadas;
		
		System.out.print("O valor do salario final é R$ " + salarioFinal + " reais.\n");
		
		//•Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. •C = 5 * ((F-32) / 9).
		
		double celsius, fahrenheit;
		celsius = 0.0;
		fahrenheit = 0;
		
		System.out.print("\n" + "Insira a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.print("A temperatura em graus Celsius é: " + celsius + "º.");
	
		System.out.printf("\nA temperatura em graus Celsius é: %.2f", celsius);
		
		leia.close();
	}

}
