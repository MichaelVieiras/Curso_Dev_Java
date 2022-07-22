package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		//Faça um programa que leia dois números e imprima o maior deles;
		
		double num1 = 0.0;
		double num2 = 0.0;
		
		System.out.print("Digite o primeiro número: ");
		num1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = scan.nextDouble();
		
		if (num1 >= num2) {
			System.out.println("O número maior é o: " + num1);
		}else {
			System.out.println("O número maior é o: " + num2 + "\n");
		}
		
		//Faça um programa que leia 3 números e mostre o maior deles;
		
		double valor1, valor2, valor3;
		valor1 = 0;
		valor2 = 0;
		valor3 = 0;
		
		System.out.print("\nDigite o primeiro número: ");
		valor1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		valor2 = scan.nextDouble();
		System.out.print("Digite o terceiro número: ");
		valor3 = scan.nextDouble();
		
		if (valor1 >= valor2 && valor1 >= valor3) {
			System.out.println("O número maior é o: " + valor1);
		}else if (valor2 >= valor1 && valor2 >= valor3){
			System.out.println("O número maior é o: " + valor2);
		}else {
			System.out.println("O número maior é o: " + valor3);
		}
		
		scan.close();
	}

}
