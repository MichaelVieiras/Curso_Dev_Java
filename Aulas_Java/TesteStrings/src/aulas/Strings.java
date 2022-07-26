package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		String frase = "   Aula Java professor Luan dia vinte e seis    ";
		char caractere = 's';
		
		System.out.println(frase.length());// conta a quatidade de caracteres inclusive espaços em branco
		System.out.println(frase.charAt(2));//localiza o caractere na posição indicada
		System.out.println(frase.lastIndexOf("J"));//localiza a ultima ocorrencia do caractre passado
		System.out.println(frase.concat("   Foi concatenado"));//concatena strings
		System.out.println(frase.contentEquals("Aula"));//compara se o conteudo da string é igual ao conteudo passdo no parametro
		System.out.println(frase.endsWith("s"));//ultima ocorrencia da string e compara se é igual ao parametro passado
		System.out.println(frase.trim().endsWith("s"));
		System.out.println(frase.trim());//remove espaço em branco no inicio e no final da string
		System.out.println(frase.toLowerCase());//coloca todas as letras da string em letras minusculas
		System.out.println(frase.toUpperCase());//coloca todas as letras da string em letras maiusculas
		System.out.println(frase.replace("a", "b"));//altera uma letra por outra passada como referencia
		System.out.println(frase.replace("Luan", "Muruk"));//altera o conjuto de caracteres
		System.out.println(frase.replaceAll("a", "A"));
		frase = " ";
		System.out.println(frase.isEmpty());//verifica se a string contem valor retorna verdadeiro ou falso
		double x = 1245.36598;
		System.out.println(String.format("%.2f", x));
		
		System.out.println(Character.toUpperCase(caractere));//Converte para letra maiuscula
		System.out.println(Character.toLowerCase(caractere));//converte para letra minuscula
		
		//System.out.println(frase.compareTo("Algo aqui"));
		scan.close();
	}

}
