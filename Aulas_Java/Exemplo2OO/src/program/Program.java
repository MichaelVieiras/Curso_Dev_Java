package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Produto produto = new Produto();
		
		System.out.print("Entre com o nome do produto: ");
		produto.nomeProduto = scan.nextLine();
		
		System.out.print("Entre com a quantidade do produto: ");
		produto.quantidade = scan.nextInt();
		
		System.out.print("Entre com o valor unitario do produto: ");
		produto.valor = scan.nextDouble();
		
		/*System.out.println("produto: " + produto.nomeProduto);
		System.out.println("\nQuantidade: " + produto.quantidade);
		System.out.println("valor unitario: " + produto.valor);
		produto.Estoque();
		System.out.println("\n\n\n" + produto);//mostra o endereço de alocação na mememoria*/
		
		System.out.println(produto);
		
		scan.close();
	}

}
