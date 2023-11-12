package br.com.fiap.beans;

public class Fotos {

	private String fotosBike;
	private String fotosNf;
	private String fotosNumerosSerie;
	
	
	
	public Fotos() {
		super();
	}
	
	
	
	public Fotos(String fotosBike, String fotosNf, String fotosNumerosSerie) {
		super();
		this.fotosBike = fotosBike;
		this.fotosNf = fotosNf;
		this.fotosNumerosSerie = fotosNumerosSerie;
	}
	
	
	
	public String getFotosBike() {
		return fotosBike;
	}
	public void setFotosBike(String fotosBike) {
		this.fotosBike = fotosBike;
	}
	public String getFotosNf() {
		return fotosNf;
	}
	public void setFotosNf(String fotosNf) {
		this.fotosNf = fotosNf;
	}
	public String getFotosNumerosSerie() {
		return fotosNumerosSerie;
	}
	public void setFotosNumerosSerie(String fotosNumerosSerie) {
		this.fotosNumerosSerie = fotosNumerosSerie;
	}
	
	
	
	
}