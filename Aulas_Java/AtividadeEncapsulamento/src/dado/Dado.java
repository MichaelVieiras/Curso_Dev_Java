package dado;

import java.util.Scanner;

public class Dado {
	
	public char dado;
	
	public Dado() {
		
		Scanner scan = new Scanner(System.in);
		char opcao;
		
		System.out.println("Deseja lançar o dado (s/n)?");
		opcao = scan.next().charAt(0);
		while (opcao == 's') {
			System.out.println("Lançamento do DADO.....................");
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado);
			System.out.println("Deseja lançar o dado novamente (s/n)?");
			opcao = scan.next().charAt(0);		
		}
		
		scan.close();
		
	}
}
