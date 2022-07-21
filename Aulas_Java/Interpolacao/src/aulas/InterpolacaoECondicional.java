package aulas;

public class InterpolacaoECondicional {

	public static void main(String[] args) {

		/*String nome = "Michael Vieira";
		int idade = 25;
		double salario = 1500.00;
		char sexo = 'M';
		
		// %s => String, %d => int ou double, %.2f => formatação (double e float), %c => char
		System.out.printf("%s tem %d anos e ganha %.2f, sexo: %c", nome, idade, salario, sexo);
		*/
		
		int a = 10;
		int b = 20;
		int c = 10;
		double d = 10.0;
		
		boolean v = true;
		boolean f = false;
		
		System.out.println("##########################################");
		System.out.println("##   &&(E)     ##   ||(OU)    ##   !    ##");
		System.out.println("## V  | V => V ## V  | V => V ## V => F ##");
		System.out.println("## V  | F => F ## V  | F => V ## F => V ##");
		System.out.println("## F  | V => F ## F  | V => V ##        ##");
		System.out.println("## F  | F => F ## F  | F => F ##        ##");
		System.out.println("##########################################");
		
		if (a == c && b == a) {
			System.out.println("Sim!");
		}else {
			System.out.println("Não!");
		}
		
		
	}

}
