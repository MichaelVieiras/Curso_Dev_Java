package program;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro cadastroCarro = new Carro();
		
		System.out.println("Ficha de cadastro do Veiculo\n");
		
		System.out.print("Informe o Tipo do Veiculo: ");
		//cadastroCarro.setTipo(scan.nextLine());
		System.out.print("Informe a Cor do Veiculo: ");
		//cadastroCarro.setCor(scan.nextLine());
		System.out.print("Qual o Estado do Veiculo: ");
		//cadastroCarro.setEstado(scan.nextLine());
		System.out.print("Qual o tipo de Cambio: ");
		//cadastroCarro.setCambio(scan.nextLine());
		System.out.print("Informe o Ano ");
		//cadastroCarro.setAno(scan.nextInt());
		System.out.print("Informe o Modelo: ");
		//cadastroCarro.setModelo(scan.nextInt());
		System.out.print("O veiculo é a Gasolina?");
		//cadastroCarro.setGasolina(true);
		System.out.print("Qual o valor atual do Veiculo: ");
		//cadastroCarro.setValor(scan.nextDouble());
		
		System.out.println("O modelo do veiculo é: " + cadastroCarro.getModelo());
		
		scan.close();
	}

}
