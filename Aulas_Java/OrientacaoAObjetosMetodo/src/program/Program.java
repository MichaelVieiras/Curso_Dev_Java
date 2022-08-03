package program;

import java.util.Locale;
import java.util.Scanner;

import entities.FormulaHeron;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		double x = FormulaHeron.CalcularAreaTriangulo(10, 10, 10);
		System.out.println("A area do triangulo: " + x);
		
		/*FormulaHeron fh = new FormulaHeron();
		
		System.out.print("Entre com os 3 lados do triangulo: ");
		fh.lado1 = scan.nextDouble();
		fh.lado2 = scan.nextDouble();
		fh.lado3 = scan.nextDouble();
		
		System.out.println("O valor da area do triangulo é: " + fh.CalcularAreaTriangulo());*/
		
		scan.close();
	}

}
