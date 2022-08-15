package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		Veiculo carro;
		Veiculo moto;
		
		ArrayList<Veiculo> carros = new ArrayList<>();
		ArrayList<Veiculo> motos = new ArrayList<>();
		
		char opcao;
		
		System.out.println("Você deseja cadastrar um veiculo? (s/n)");
		opcao = scan.next().charAt(0);
		
		while(Character.toLowerCase(opcao) == 's') {
			carro = new Carro();
			moto = new Moto();
			System.out.println("Qual o tipo de veiculo que deseja cadastrar (c/m)");
			char opcao2 = scan.next().charAt(0);
			
			switch(Character.toLowerCase(opcao2)) {
			case 'c':
				scan.nextLine();
				System.out.print("Entre o tipo do veiculo: ");
				carro.setTipo(scan.nextLine());
				
				System.out.print("Entre com o tipo do combutivel: ");
				carro.setTipoCombustivel(scan.nextLine());
				
				System.out.print("Entre com a potencia do motor: ");
				carro.setMotor(scan.nextLine());
				
				System.out.print("Entre com o modelo do veiculo: ");
				carro.setModelo(scan.nextLine());
				
				System.out.print("Entre com a quantidade de passageiros: ");
				carro.setQtdPassageiros(scan.nextInt());
				
				System.out.print("Entre com a quantidade de pneus: ");
				carro.setQtdPneus(scan.nextInt());
				
				scan.nextLine();
				System.out.println("O veiculo possui ar condicionado (s/n): ");
				((Carro) carro).setArCondicionado(scan.nextLine());
				
				System.out.print("O veiculo possui sonorização (s/n): ");
				((Carro) carro).setSonorizacao(scan.nextLine());
				carros.add(carro);
				
				break;
			case 'm':
				scan.nextLine();
				System.out.print("Entre o tipo do veiculo: ");
				moto.setTipo(scan.nextLine());
				
				System.out.print("Entre com o tipo do combutivel: ");
				moto.setTipoCombustivel(scan.nextLine());
				
				System.out.print("Entre com a potencia do motor: ");
				moto.setMotor(scan.nextLine());
				
				System.out.print("Entre com o modelo do veiculo: ");
				moto.setModelo(scan.nextLine());
				
				System.out.print("Entre com a quantidade de passageiros: ");
				moto.setQtdPassageiros(scan.nextInt());
				
				System.out.print("Entre com a quantidade de pneus: ");
				moto.setQtdPneus(scan.nextInt());
				
				scan.nextLine();
				System.out.print("Qual o tipo de direção: ");
				((Moto) moto).setDirecao(scan.nextLine());
				
				System.out.print("Qual o fabricante: ");
				((Moto) moto).setFabricante(scan.nextLine());
				
				motos.add(moto);

				break;
			default:
				System.out.println("Tipo incopativel!");
				break;
			}
			
			
			System.out.println("Deseja cadastrar outro veiculo (s/n): ");
			opcao = scan.next().charAt(0);
		}
		
		System.out.println("Qual lista de veiculos cadastrados deseja verificar (c - carro| m - moto| a - ambas)");
		char escolha = scan.next().charAt(0);
		switch (Character.toLowerCase(escolha)) {
		case 'c':
			for(Veiculo listaCarros : carros) {
				System.out.println(listaCarros);
			}
			break;

		case 'm':
			for(Veiculo listaMotos : motos) {
				System.out.println(listaMotos);
			}
			break;
			
		case 'a':
			for(Veiculo listaMotos : motos) {
				System.out.println(listaMotos);
			}
			for(Veiculo listaCarros : carros) {
				System.out.println(listaCarros);
			}	
			break;
		default:
			break;
		}
		
		
		
		scan.close();
	}

}
