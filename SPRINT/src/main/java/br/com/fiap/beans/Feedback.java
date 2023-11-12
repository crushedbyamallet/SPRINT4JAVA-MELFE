package br.com.fiap.beans;

public class Feedback {

	private String depoimento;
	private String dataFeedback;
	private String nomeResponsavel;
	
	
	
	public Feedback() {
		super();
	}
	
	
	
	public Feedback(String depoimento, String dataFeedback, String nomeResponsavel) {
		super();
		this.depoimento = depoimento;
		this.dataFeedback = dataFeedback;
		this.nomeResponsavel = nomeResponsavel;
	}
	
	
	
	public String getDepoimento() {
		return depoimento;
	}
	public void setDepoimento(String depoimento) {
		this.depoimento = depoimento;
	}
	public String getDataFeedback() {
		return dataFeedback;
	}
	public void setDataFeedback(String dataFeedback) {
		this.dataFeedback = dataFeedback;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	
	
	
}
