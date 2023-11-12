package br.com.fiap.beans;

public class NotaFiscal {

	private String cpf;
	private String dataEmissao;
	private double valorTotal;
	private String nomeComprador;
	
	
	
	
	public NotaFiscal() {
		super();
	}
	
	
	
	public NotaFiscal(String cpf, String dataEmissao, double valorTotal, String nomeComprador) {
		super();
		this.cpf = cpf;
		this.dataEmissao = dataEmissao;
		this.valorTotal = valorTotal;
		this.nomeComprador = nomeComprador;
	}


	

	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getDataEmissao() {
		return dataEmissao;
	}



	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public String getNomeComprador() {
		return nomeComprador;
	}



	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
	
	
	
	
}

