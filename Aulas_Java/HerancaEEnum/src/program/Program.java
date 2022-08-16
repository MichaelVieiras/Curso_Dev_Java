package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		//Cliente cliente = new Cliente();
		Conta contaCorrente = new ContaCorrente();
		Conta conta = new Conta();
		
		conta.Depositar(100);
		contaCorrente.Depositar(200);
		
		conta.Sacar(50);
		contaCorrente.Sacar(50);
		System.out.println("Saldo Conta: " + conta.getSaldo());
		System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
		
		
		
		
		
		
		
		/*System.out.println("Entre com o nome do titular: ");
		cliente.setNome(scan.nextLine());
		
		System.out.println("Entre com o CPF do titular: ");
		cliente.setCpf(scan.nextLine());
		
		contaCorrente.setTitular(cliente);
		
		System.out.println("Entre com o numero da agencia: ");
		contaCorrente.setAgencia(scan.nextInt());
		
		System.out.println("Entre com o numero da conta: ");
		contaCorrente.setNumeroConta(scan.nextInt());
		
		System.out.println("Digite o valor para deposito: ");
		contaCorrente.Depositar(scan.nextDouble());
		
		System.out.println("Conta criada!");
		
		System.out.println(contaCorrente);
		
		System.out.print("\nEntre com o valor do saque: ");
		contaCorrente.Sacar(scan.nextDouble());
		
		System.out.println("Saldo atualizado: ");
		System.out.println(contaCorrente);*/
		
		scan.close();
	}

}
