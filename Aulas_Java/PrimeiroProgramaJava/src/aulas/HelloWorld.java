package aulas;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minhaVariavel = 10;
		String minhaString = "Michael Vieira";
		double minhaDouble = 10.5;
		char minhaChar = 'M';
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("Hello World");
		System.out.println("Sou seu primeiro Programa Java");
		System.out.println(minhaVariavel);
		System.out.println(minhaString);
		System.out.println(minhaDouble);
		System.out.println(minhaChar);
		System.out.println(verdadeiro);
		System.out.println(falso);
		
		System.out.println(minhaVariavel + " " + minhaString + " " + minhaDouble); /*Concatenação das variaveis*/
		System.out.println(minhaString + "\n" + verdadeiro); /* "\n" quebra de linha.*/
		
		System.out.print("Aqui ");
		System.out.print("vai uma ");
		System.out.print("mensagem!");
	}

}
