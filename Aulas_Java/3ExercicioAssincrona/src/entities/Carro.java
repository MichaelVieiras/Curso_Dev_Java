package entities;

public class Carro extends Veiculo {
	
	private String arCondicionado;
	private String sonorizacao;
	
	public Carro() {
		
	}
	
	public Carro(String arCondicionado, String sonorizacao) {
		super();
		this.arCondicionado = arCondicionado;
		this.sonorizacao = sonorizacao;
	}

	public Carro(int qtdPneus, String motor, int qtdPassageiros, String tipoCombustivel, String tipo, String modelo) {
		super(qtdPneus, motor, qtdPassageiros, tipoCombustivel, tipo, modelo);

	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public String getSonorizacao() {
		return sonorizacao;
	}

	public void setSonorizacao(String sonorizacao) {
		this.sonorizacao = sonorizacao;
	}

	@Override
	public String toString() {
		return "\nCarros cadastrados" + "\nQuantidade de Pneus: " + getQtdPneus() 
				+ "\nMotor:" + getMotor() 
				+ "\nQuantidade Passageiros= " + getQtdPassageiros()
				+ "\nTipo Combustivel= " + getTipoCombustivel() 
				+ "\nTipo= " + getTipo() 
				+ "\nModelo= " + getModelo() 
				+ "\nAr Condicionado= " + arCondicionado 
				+ "\nSonorizacao= " + sonorizacao;
	}
	
	
	
}
