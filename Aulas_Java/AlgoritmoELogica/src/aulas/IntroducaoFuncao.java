package aulas;

public class IntroducaoFuncao {

	public static void main(String[] args) {

		ImprimeNome();
		RecebeNome("Michael Vieira");
		System.out.println("A soma dos numeros é igual a: " + Somar());
		System.out.println("A soma dos 2 numeros é: " + SomarParametros(10, 20));
		System.out.println(DoisParametros("Michael", 25));
	}

	public static void ImprimeNome() {

		System.out.println("Meu nome é: Michael");
	}

	public static void RecebeNome(String nome) {

		System.out.println("Meu nome é: " + nome);
	}

	public static int Somar() {

		return 1 + 1;

	}

	public static int SomarParametros(int j, int f) {
		// int somar = j + f;
		// return somar;
		return j + f;

	}

	public static String DoisParametros(String nome, int idade) {

		return nome + " tem " + idade + " anos";
	}

}
