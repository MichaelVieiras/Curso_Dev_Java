package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OitavoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		/*1. Crie um programa para receber os dados de uma pessoa (altura, peso, idade e sexo), imprima na tela seu imc e se está dentro do peso ideal, sobrepeso ou abaixo do peso;*/

		String nome;
		int idade = 0;
		double altura = 0;
		double peso = 0;
		double classificacao = 0;
		char sexo;
		
		System.out.println("---------- IMC - CLASSIFICAÇÃO ---------");
		System.out.println("| Menor que 18.5 - Abaixo do peso      |");
		System.out.println("| Entre 18.5 e 24.9 - Peso normal      |");
		System.out.println("| Entre 25.0 e 29.9 - Pré-obesidade    |");
		System.out.println("| Entre 30.0 e 34.9 - Obesidade Grau 1 |");
		System.out.println("| Entre 35.0 e 39.9 - Obesidade Grau 2 |");
		System.out.println("| Acima de 40 - Obesidade Grau 3       |");
		System.out.println("----------------------------------------");
		
		System.out.print("Informe seu nome: ");
		nome = scan.nextLine();
		System.out.print("Informe sua idade: ");
		idade = scan.nextInt();
		System.out.print("Informe sua altura: ");
		altura = scan.nextDouble();
		System.out.print("Informe seu peso: ");
		peso = scan.nextDouble();
		System.out.print("Informe seu sexo: ");
		sexo = scan.next().charAt(0);
		
		classificacao = CalcularIMC(peso, altura);
		
		if (classificacao < 18.5) {
			System.out.printf("Seu IMC é %.2f", CalcularIMC(peso, altura));
			System.out.printf("\n%s do sexo %c tem %d anos, mede %.2f metros, pesa %.2f Kg e está Abaixo do Peso.", nome, sexo, idade, altura, peso);
		}else if(classificacao > 18.5 && classificacao < 24.9) {
			System.out.printf("Seu IMC é %.2f", CalcularIMC(peso, altura));
			System.out.printf("\n%s do sexo %c tem %d anos, mede %.2f metros, pesa %.2f Kg e está com o Peso Normal.", nome, sexo, idade, altura, peso);
		}else if(classificacao > 25.0 && classificacao < 29.9) {
			System.out.printf("Seu IMC é %.2f", CalcularIMC(peso, altura));
			System.out.printf("\n%s do sexo %c tem %d anos, mede %.2f metros, pesa %.2f Kg e está com Pré-obesidade.", nome, sexo, idade, altura, peso);
		}else if(classificacao > 30.0 && classificacao < 34.9) {
			System.out.printf("Seu IMC é %.2f", CalcularIMC(peso, altura));
			System.out.printf("\n%s do sexo %c tem %d anos, mede %.2f metros, pesa %.2f Kg e está com com Obesidade Grau 1.", nome, sexo, idade, altura, peso);
		}else if(classificacao > 35.0 && classificacao < 39.9) {
			System.out.printf("Seu IMC é %.2f", CalcularIMC(peso, altura));
			System.out.printf("\n%s do sexo %c tem %d anos, mede %.2f metros, pesa %.2f Kg e está com com Obesidade Grau 2.", nome, sexo, idade, altura, peso);
		}else {
			System.out.printf("Seu IMC é %.2f", CalcularIMC(peso, altura));
			System.out.printf("\n%s do sexo %c tem %d anos, mede %.2f metros, pesa %.2f Kg e está com com Obesidade Grau 3.", nome, sexo, idade, altura, peso);
		}
		
		
		/*2. Crie um programa que receba o valor da gasolina e do álcool, e retorno para o usuário qual está compensando mais utilizar;*/
		
		double gasolina = 0;
		double alcool = 0;
		
		System.out.println("\n\nO cálculo básico para se descobrir se o álcool é vantajoso ou não em relação à gasolina é simples. Basta dividir o preço do litro do álcool pelo da gasolina. Se o resultado for inferior a 0,7, use álcool. Se for maior que 0,7, então a gasolina é melhor.\n");
		System.out.print("Digite o valor do Álcool R$: ");
		alcool = scan.nextDouble();
		System.out.print("Digite o valor da Gasolina R$: ");
		gasolina = scan.nextDouble();
		
		CombustivelComp(gasolina, alcool);
		
		/*3. Crie um programa para calcular a formula do segundo grau, retorne valor de xI e xII;*/
		double a = 0;
		double b = 0;
		double c = 0;
		
		System.out.println("\n\nRepresentação da equação de segundo grau: ax² + bx + c = 0.");
		System.out.print("Digite o valor de A: ");
		a = scan.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = scan.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = scan.nextDouble();
		
		System.out.printf("%.0fx² + %.0fx + %.0f = 0", a, b, c);
		
		EquacaoSegundoGrau(a, b, c);
		
		
		scan.close();
	}
	//calculo questão 1
	public static double CalcularIMC(double peso, double altura) {

		double imc = (peso / (altura * altura));
		
		return imc;
		
	}
	
	//calculo questão 2
	public static double CombustivelComp(double gasolina, double alcool) {
		double calculo = alcool / gasolina;
		
		if (calculo < 0.7) {
			System.out.printf("RESULTADO: %.2f.", calculo);
			System.out.println("\nO Álcool está compensando mais!");
			return alcool;
		}else {
			System.out.printf("RESULTADO: %.2f.", calculo);
			System.out.println("\nA Gasolina está compensando mais!");
		}
		return gasolina;
	}
	
	//calculo questão 3
	public static double EquacaoSegundoGrau(double a, double b, double c) {
		
		double solucao = 0;
		double elevacao = 2;
		
		//calcular o valor de DELTA
		double delta = (double) (Math.pow(b, elevacao) - 4 * a * c);
		
		//calcular o valor da raiz quadrada de DELTA
		double raizdelta = (double) Math.sqrt(delta);
		
		//calcular o valor de xI e xII
		double xI = (-b + raizdelta) / (2 * a);
		double xII = (-b - raizdelta) / (2 * a); 
		
		//verificando se a equação é igual a 0
		double resultado = (double) (a * Math.pow(xII, elevacao) + b * xII + c);
		double resultado2 = (double) (a * Math.pow(xII, elevacao) + b * xII + c);
		
		System.out.println("\nO valor de DELTA é : " + delta);
		System.out.printf("Solução para essa equação é: {%.2f, %.2f}.", xI, xII);
		
		if (resultado != 0 || resultado2 != 0) {
			System.out.println("\nO resultado dessa equação é diferente de zero, portanto, está incorreta.");
			return solucao;
		}else {
		System.out.printf("\nUtilizando X = %.2f, o resultado da Equação de Segundo Grau é igual a: %.2f", xI, resultado);
		System.out.printf("\nUtilizando X = %.2f, o resultado da Equação de Segundo Grau é igual a: %.2f", xII, resultado2);
		}
		return solucao;
		
	}
	
}
