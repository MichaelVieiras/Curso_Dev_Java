package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		//Produto produto = new Produto("Maçã", 10, 1.0);
		
		System.out.print("Entre com o nome do produto: ");
		String nome = scan.nextLine();
		
		System.out.print("Entre com a quantidade do produto: ");
		int quantidade = scan.nextInt();
		
		System.out.print("Entre com o valor unitario do produto: ");
		double valor = scan.nextDouble();
		
		Produto produto = new Produto(nome, quantidade, valor);
		
		System.out.println(produto);
		
		System.out.print("Entre com a quantidade a ser adicionada: ");
		int qtd = scan.nextInt();
		produto.AdicionarItem(qtd);
		
		System.out.println("Estoque atualizado: ");
		System.out.println(produto);
		
		System.out.print("Entre com a quantidade a ser removida: ");
		qtd = scan.nextInt();
		produto.RemoverItem(qtd);
		
		System.out.println("Estoque atualizado: ");
		System.out.println(produto);
		
		scan.close();

	}

}
