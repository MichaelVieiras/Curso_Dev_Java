package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Conta conta = new Conta();
		
		System.out.println("Entre com o numero da conta: ");
		conta.setNumeroConta(scan.nextInt());
		
		scan.nextLine();
		System.out.println("Entre com o titular: ");
		conta.setTitularDaConta(scan.nextLine());
		
		System.out.println("Entre com a agencia: ");
		conta.setAgencia(scan.nextInt());
		
		System.out.println("saldo: " + conta.getSaldo());
		
		System.out.println("Deseja depositar algum valor?");
		System.out.println("Qual valor do deposito: ");
		conta.Depositar(scan.nextDouble());
		
		System.out.println("Saldo atualizado: " + conta.getSaldo());
		
		System.out.println();
		
		System.out.println(conta.getAgencia() + " " + conta.getNumeroConta() + " " + conta.getTitularDaConta() + " " + conta.getSaldo());
		
		scan.close();
	}

}
