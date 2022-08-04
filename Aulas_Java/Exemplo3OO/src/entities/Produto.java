package entities;

public class Produto {

	private String nomeProduto;
	private int quantidade; //é de boa pratica inicializar o atributo
	private double valor;
	
	public Produto() {	
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		if(nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto;
		}else {
			this.nomeProduto = "padrão";
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
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
		
		return "Nome produto: " + nomeProduto + "\nQuantidade: " + quantidade + "\nValor unitario R$: " + valor + "\nValor total em estoque R$: " + String.format("%.2f", ValorTotalEmEstoque()).replaceAll(",", ".");
	}
}
