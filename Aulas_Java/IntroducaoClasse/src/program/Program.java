package program;

import java.util.Scanner;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Entre com o nome: ");
		pessoa.nome = scan.nextLine();
		
		System.out.print("Entre com a idade: ");
		pessoa.idade = scan.nextInt();
		
		System.out.print("Entre com o sexo: ");
		pessoa.sexo = scan.next().charAt(0);
		
		System.out.printf("Nome %s, idade %d anos e sexo %c.", pessoa.nome, pessoa.idade, pessoa.sexo);
		
		scan.close();
	}

}
