package aulas;

import java.util.Scanner;

public class CorrecaoSextoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*double nota = 0;
	    
		do {
			System.out.println("Entre com uma nota de 0 a 10: ");
			nota = scan.nextInt();
			if (nota > 10 || nota < 0) {
				System.out.println("Você não digitou um nota entre 0 e 10");
			}	
		}while (nota < 0 || nota > 10);
		System.out.println("O numero digitado foi: " + nota);*/
		
		/*String usuario;
		String senha;
		
		System.out.print("Entre com o nome do usuario: ");
		usuario = scan.nextLine();
		
		System.out.print("Entre com a senha: ");
		senha = scan.nextLine();
		
		while(usuario.equals(senha)) {
			System.out.println("Usuario invalido! ");
			
			System.out.print("Entre com o nome do usuario: ");
			usuario = scan.nextLine();
			
			System.out.print("Entre com a senha: ");
			senha = scan.nextLine();
		}
		
		System.out.println("Cadastro realizado com sucesso");*/
		
		String nome;
		int idade = 0;
		double salario = 0;
		char sexo;
		char estadoCivil;
		
		System.out.print("Digite o seu nome: ");
		nome = scan.nextLine();	
		
		while(nome.length()<= 3) {
			System.out.println("Digite um nome valido!");
			System.out.print("Digite o seu nome: ");
			nome = scan.nextLine();
			
		}
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		while(idade < 0 || idade > 150) {
			System.out.println("Digite uma idade valida!");
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
		}
		System.out.print("Digite o valor do seu salario R$: ");
		salario = scan.nextDouble();
		while(salario < 0) {
			System.out.println("Digite um valor valido!");
			System.out.print("Digite o valor do seu salario R$: ");
			salario = scan.nextDouble();
		}
		System.out.print("Informe o seu sexo (f ou m): ");
		sexo = scan.next().charAt(0);
		while(Character.toUpperCase(sexo) != 'F' && Character.toUpperCase(sexo) != 'M') {
			System.out.println("Digite o sexo conforme solicitado!");
			System.out.print("Informe o seu sexo (F ou M): ");
			sexo = scan.next().charAt(0);
		}
		System.out.print("Digite seu estado civil (s > Solteiro(a), c > Casado(a), v > Viuvo(a), d > Divorciado(a): ");
		estadoCivil = scan.next().charAt(0);
		while(Character.toUpperCase(estadoCivil) != 'S' && Character.toUpperCase(estadoCivil) != 'C' && Character.toUpperCase(estadoCivil) != 'V' && Character.toUpperCase(estadoCivil) != 'D') {
			System.out.println("Insira os dados conforme solicitado acima!");
			System.out.print("Digite seu estado civil (s > Solteiro(a), c > Casado(a), v > Viuvo(a), d > Divorciado(a): ");
			estadoCivil = scan.next().charAt(0);
		}
		System.out.println("Formulario preenchido com sucesso!!!");
		System.out.printf("\nNome: " + nome + " | Idade: " + idade + "anos | Sexo: " + sexo +  " | Estado Civil: " + estadoCivil + " | Salario R$: " + salario + " reais");
				

		scan.close();
	}

}
