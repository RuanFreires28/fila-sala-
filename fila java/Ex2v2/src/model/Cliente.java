package model;

public class Cliente {

	private String nome;
	private int QtdPecas;
	private float ValorPecas;
	
	public Cliente(String nome, int QtdPecas, float ValorPecas) 
	{
		this.nome = nome;
		this.QtdPecas = QtdPecas;
		this.ValorPecas = ValorPecas;
	}
	
	public Cliente()
	{
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdPecas() {
		return QtdPecas;
	}

	public void setQtdPecas(int qtdPecas) {
		QtdPecas = qtdPecas;
	}

	public float getValorPecas() {
		return ValorPecas;
	}

	public void setValorPeças(float valorPecas) {
		ValorPecas = valorPecas;
	}

}
