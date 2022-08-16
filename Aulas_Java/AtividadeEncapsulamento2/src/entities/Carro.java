package entities;

public class Carro {
	
	private String tipo;
	private String cor;
	private String estado;
	private String cambio;
	private boolean gasolina;
	private double valor;
	private int ano;
	private int modelo;
	
	
	public void CadastroCarro() {
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getModelo() {
		modelo = 2015;
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public boolean isGasolina() {
		return gasolina;
	}

	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
