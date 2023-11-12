package br.com.fiap.beans;

public class Modificacao {

	private String tipoModificacao;
	private String data;
	private String pecaModificada;
	private String fotoPeca;
	private String fotoNfPeca;

	public Modificacao(String tipo, String data,String pecaModificada, String fotoPeca, String fotoNfPeca) {
		super();
		this.tipoModificacao = tipo;
		this.data = data;
		this.pecaModificada = pecaModificada;
		this.fotoPeca = fotoPeca;
		this.fotoNfPeca = fotoNfPeca;
	}

//	public Modificacao() {
//		super();
//		this.tipoModificacao = tipoModificacao;
//		this.data = data;
//		this.pecaModificada = pecaModificada;
//		this.fotoPeca = fotoPeca;
//		this.fotoNfPeca = fotoNfPeca;
//	}



	public String getTipoModificacao() {
		return tipoModificacao;
	}



	public void setTipoModificacao(String tipoModificacao) {
		this.tipoModificacao = tipoModificacao;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getPecaModificada() {
		return pecaModificada;
	}



	public void setPecaModificada(String pecaModificada) {
		this.pecaModificada = pecaModificada;
	}



	public String getFotoPeca() {
		return fotoPeca;
	}



	public void setFotoPeca(String fotoPeca) {
		this.fotoPeca = fotoPeca;
	}



	public String getFotoNfPeca() {
		return fotoNfPeca;
	}



	public void setFotoNfPeca(String fotoNfPeca) {
		this.fotoNfPeca = fotoNfPeca;
	}
	
	
	
}