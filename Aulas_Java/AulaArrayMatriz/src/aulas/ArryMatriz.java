package aulas;

import java.util.Scanner;

public class ArryMatriz {

	private static final int String = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*int[] numero = new int[5];// declara a quantidade de posições do array
		int[] numero2 = {1, 25, 10};// inicializa o array
		
		System.out.println(numero2[1]);// obtem o valor do array no indice indicado
		System.out.println(numero[4]);//resultado vai ser zero, pois temos somente a quantidade de posições
		System.out.println(numero.length);// obtem o tamanho do array
		*/
		/*System.out.println("Entre com a quantidade: ");
		int qtd = scan.nextInt();
		
		int[] passadoTeclado = new int[qtd];
		
		System.out.println("Quantidade de posições: " + passadoTeclado.length);
		
		int[] numeros = {1, 10, 25, 9, 50};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("posição: " + i + ", valor no array: " + numeros[i]);
		}
		for(int numero : numeros) {
			System.out.println(numero);
		}
		System.out.println("Entre com a quantidade de nomes: ");
		int qtd = scan.nextInt();
		
		String[] nomes = new String[qtd];
		scan.nextLine();
		
		for(int i = 0; i < nomes.length; i++) {
			
			System.out.print("Entre com o nome: ");
			nomes[i] = scan.nextLine();
		}
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Nome: " + nomes[i]);
		}
		
		for(String nome : nomes) {
			System.out.println(nome);
		}*/
		
		String[][] numerosArray = new String[3][3];
		int contador = 10;
		
		for(int i = 0; i < numerosArray.length; i++) {
			
			for(int j = 0; j < numerosArray.length; j++) {
				numerosArray[i][j] = Integer.toString(contador);
				if(numerosArray[i] != numerosArray[j]) {
					numerosArray[i][j] = " ";										
				}
				System.out.print(numerosArray[i][j] + "\t");
				contador++;
			}
			System.out.println("\n");
		}

		
		/*if(numerosArray[i] == numerosArray[j]) {
			System.out.print(numerosArray[i][j] + "\t");
			contador++;
		}
		numerosArray[0][0] = Integer.toString(contador);;
		numerosArray[0][1] = " ";
		numerosArray[0][2] = " ";
		numerosArray[1][0] = " ";
		numerosArray[1][1] = Integer.toString(contador);
		numerosArray[1][2] = " ";
		numerosArray[2][0] = " ";
		numerosArray[2][1] = " ";
		numerosArray[2][2] = Integer.toString(contador);*/
		
			
		scan.close();
	}

}
