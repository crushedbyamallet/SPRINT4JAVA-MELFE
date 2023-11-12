package br.com.fiap.beans;

public class Vistoria {

	private Fotos fotos;
	private Videos videos;
	private String dataVistoria;
	
	
	
	public Vistoria() {
		super();
	}
	
	
	
	public Vistoria(String dataVistoria) {
		super();
		this.dataVistoria = dataVistoria;
	}
	
	
	public Vistoria(Fotos fotos, Videos videos, String dataVistoria) {
		super();
		this.fotos = fotos;
		this.videos = videos;
		this.dataVistoria = dataVistoria;
	}



	public Fotos getFotos() {
		return fotos;
	}



	public void setFotos(Fotos fotos) {
		this.fotos = fotos;
	}



	public Videos getVideos() {
		return videos;
	}



	public void setVideos(Videos videos) {
		this.videos = videos;
	}



	public String getDataVistoria() {
		return dataVistoria;
	}



	public void setDataVistoria(String dataVistoria) {
		this.dataVistoria = dataVistoria;
	}
	
	
}
