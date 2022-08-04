package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		Produto produto = new Produto();
		
		System.out.print("Entre com o nome do produto: ");
		String nome = scan.nextLine();
		produto.setNomeProduto(nome);
		
		System.out.println(produto.getNomeProduto());
		
		
		System.out.print("Entre com o valor unitario do produto: ");
		double valor = scan.nextDouble();
		produto.setValor(valor);
				
		System.out.println(produto);
		
		System.out.print("Entre com a quantidade a ser adicionada: ");
		int qtd = scan.nextInt();
		produto.AdicionarItem(qtd);
		
		System.out.println("\nEstoque atualizado: ");
		System.out.println(produto);
		
		System.out.print("Entre com a quantidade a ser removida: ");
		qtd = scan.nextInt();
		produto.RemoverItem(qtd);
		
		System.out.println("\nEstoque atualizado: ");
		System.out.println(produto);
		
		scan.close();

	}

}
