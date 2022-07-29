package aulas;

import java.util.Locale;
import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int opcaoEscolhida = 0;

		int[][] numerosArray = new int[3][3];
		int contador = 10;

		System.out.println("Imprima os valores da matriz na diagonal.\r\n"
				+ "Ex: 10 14 18, imprimir em uma linha, não é para fazer a matriz e imprimir os números na diagonal, mas sim pegar os números que estão na diagonal e imprimir esses números.\n");
		for (int i = 0; i < numerosArray.length; i++) {

			for (int j = 0; j < numerosArray.length; j++) {

				numerosArray[i][j] = contador;
				System.out.print(numerosArray[i][j] + "\t");
				contador++;
			}

			System.out.println("\n");
		}

		System.out.println("1 - Desafio proposto");
		System.out.println("2 - Forma diferente do Desafio");
		System.out.print("Escolha uma opção de visualização do desafio: ");
		opcaoEscolhida = scan.nextInt();

		switch (opcaoEscolhida) {
		case 1:
			System.out.println("\n" + numerosArray[0][0] + " " + numerosArray[1][1] + " " + numerosArray[2][2]);
			break;
		case 2:
			String[][] numerosArray2 = new String[3][3];
			int contador2 = 10;
			System.out.println();
			for (int i = 0; i < numerosArray2.length; i++) {

				for (int j = 0; j < numerosArray2.length; j++) {
					numerosArray2[i][j] = Integer.toString(contador2);
					if (numerosArray2[i] != numerosArray2[j]) {
						numerosArray2[i][j] = " ";
					}
					System.out.print(numerosArray2[i][j] + "\t");
					contador2++;
				}
				System.out.println("\n");
			}
			break;
		default:
			System.out.println("Opção invalida!!!");
			System.out.println("Escolha a opção 1 ou 2!");
			break;
		}

		scan.close();
	}

}
