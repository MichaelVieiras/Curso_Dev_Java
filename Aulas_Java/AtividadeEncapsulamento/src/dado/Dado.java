package dado;

import java.util.Scanner;

public class Dado {
	public int dado;
	
	public void Dado(int dado) {
		Scanner scan = new Scanner(System.in);
		
		char opcao2 = (char) dado;
		
		while (opcao2 == 's') {
			System.out.println("Lançamento do DADO.....................");
			int dado2 = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado2);
			System.out.println("Deseja lançar o dado novamente | 1 - Sim | 2 - Não |?");
			opcao2 = scan.next().charAt(0);	
		}
		
		System.out.println("Encerrado");
		
		scan.close();
	}
}
