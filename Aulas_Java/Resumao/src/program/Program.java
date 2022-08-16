package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import entities.Clientes;
import entities.Conta;
import entities.ContaException;

public class Program {

	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);		
		
		try {
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		Clientes cliente = new Clientes();
		
		System.out.println("Entre com o numero da conta: ");
		conta.setNumeroConta(scan.nextInt());
		
		scan.nextLine();
		System.out.println("Entre com o titular: ");
		cliente.setNome(scan.nextLine());
		conta.setTitularDaConta(cliente);
		
		System.out.println("Entre com a agencia: ");
		conta.setAgencia(scan.nextInt());
		
		System.out.println("saldo: " + conta.getSaldo());
		System.out.println("Deseja depositar algum valor?");
		System.out.println("Qual valor do deposito: ");
		conta.Depositar(scan.nextDouble());
		
		System.out.println("Saldo atualizado: " + conta.getSaldo());	
		System.out.println(conta.getAgencia() + " " + conta.getNumeroConta() + " " + conta.getTitularDaConta().getNome() + " " + conta.getSaldo());
		
		System.out.println("Conta da ana, saldo: " + conta2.getSaldo());
		
		System.out.println("Qual o valor que vai transferir: ");
		double valor = scan.nextDouble();
		conta.Transferir(valor, conta2);
		
		System.out.println("Saldo: " + conta2.getSaldo());
		
		}catch (ContaException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (MissingFormatArgumentException e2) {
	
		}catch(InputMismatchException e3) {
			System.out.println("Tipo incompativel, você digitou uma letra!");
		}
		
		scan.close();
	}

}
