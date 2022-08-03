package entities;

public class Produto {
	
	public String nomeProduto;
	public int quantidade; //é de boa pratica inicializar a variavel
	public double valor;
	
	/*public void Estoque() {
		System.out.printf("Temos em estoque: %.2f ", valor * quantidade);
	}*/
	
	@Override
	public String toString() {
		
		System.out.printf("Nome produto: %s \nQuantidade: %d \nValor unitario: %.2f \nValor total em estoque: %.2f", nomeProduto, quantidade, valor, valor * quantidade);
		return "";
		
		//return "Nome produto: " + nomeProduto + "\nQuantidade: " + quantidade + "\nValor unitario: " + valor + "\nValor total em estoque: " + (valor * quantidade);
	}
}
