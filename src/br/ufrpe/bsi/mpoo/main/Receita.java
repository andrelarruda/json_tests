package br.ufrpe.bsi.mpoo.main;

public class Receita {
	
	private int tipo;
	private String nome;
	private String ingredientes;
	private String modoDePreparo;
	private String outrasInformacoes;
	
	public Receita() {
		
	}
	
	public Receita(int tipo, String nome, String ingredientes, String modoPreparo, String outrasInfo) {
		this.tipo = tipo;
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoPreparo;
		this.outrasInformacoes = outrasInfo;

	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("************************************\n");
		sb.append(this.getNome() + "\n\n");
		sb.append("Ingredientes:\n" + this.getIngredientes());
		sb.append("Modo de preparo:\n" + this.getModoDePreparo());
		if (this.getOutrasInformacoes() != null) {
			sb.append("Outras informações:\n" + this.getOutrasInformacoes());
		}
		sb.append("-------------------------------------");
		return sb.toString();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getModoDePreparo() {
		return modoDePreparo;
	}
	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}
	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}
	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}
	
	

}
