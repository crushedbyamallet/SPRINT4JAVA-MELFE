package br.com.fiap.beans;

public class ClasseCliente {
	
	private String email;
	private String senha;
	private int idCliente;
	private Endereco endereco;
	private Bike bike;
	private Vistoria vistoria;
	private NotaFiscal notaFiscal;
	private Modificacao modificacao;
	private Feedback feedback;
	
	//Método construtor vazio
	public ClasseCliente() {
		super();
	}

	//Método construtor para iniciar valor
	public ClasseCliente(String email, String senha, int idCliente) {
		super();
		this.email = email;
		this.senha = senha;
		this.idCliente = idCliente;
	}

	public ClasseCliente(String email, String senha, int idCliente, Endereco endereco, Bike bike, Vistoria vistoria,
			NotaFiscal notaFiscal, Modificacao modificacao, Feedback feedback) {
		super();
		this.email = email;
		this.senha = senha;
		this.idCliente = idCliente;
		this.endereco = endereco;
		this.bike = bike;
		this.vistoria = vistoria;
		this.notaFiscal = notaFiscal;
		this.modificacao = modificacao;
		this.feedback = feedback;
	}


	
	
	//Getters e Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Vistoria getVistoria() {
		return vistoria;
	}

	public void setVistoria(Vistoria vistoria) {
		this.vistoria = vistoria;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Modificacao getModificacao() {
		return modificacao;
	}

	public void setModificacao(Modificacao modificacao) {
		this.modificacao = modificacao;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
	
	
}