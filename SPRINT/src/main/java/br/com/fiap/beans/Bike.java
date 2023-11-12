package br.com.fiap.beans;

public class Bike {

	private int idBike;
	private double preco;
	private String nSerie;
	private String marca;
	private String eletrica;
	
	
	
	public Bike() {
		super();
	}
	
	
	
	public Bike(int idBike, double preco, String nSerie, String marca, String eletrica) {
		super();
		this.idBike = idBike;
		this.preco = preco;
		this.nSerie = nSerie;
		this.marca = marca;
		this.eletrica = eletrica;
	}



	public int getIdBike() {
		return idBike;
	}



	public void setIdBike(int idBike) {
		this.idBike = idBike;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}


	public String getnSerie() {
		return nSerie;
	}


	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getEletrica() {
		return eletrica;
	}
	
	public void setEletrica(String eletrica) {
		this.eletrica = eletrica;
	}
	
}