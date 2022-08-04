package entities;

public class Produto {

	public String nomeProduto;
	public int quantidade; //é de boa pratica inicializar o atributo
	public double valor;
	
	/*public Produto() {
		
	}*/
	
	public Produto(String nomeProduto, int quantidade, double valor) {
		//atributo da classe     parametro recebido no construtor
		this.nomeProduto =       nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
	}
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}
	
	
	@Override
	public String toString() {
		
		return "Nome produto: " + nomeProduto + "\nQuantidade: " + quantidade + "\nValor unitario: " + valor + "\nValor total em estoque: " + String.format("%.2f", ValorTotalEmEstoque()).replaceAll(",", ".");
	}
}
