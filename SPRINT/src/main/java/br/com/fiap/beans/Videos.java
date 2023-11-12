package br.com.fiap.beans;

public class Videos {

	private String videosBike;
	private String videosNf;
	private String videosNumerosSerie;
	
	
	
	public Videos() {
		super();
	}
	
	
	
	public Videos(String videosBike, String videosNf, String videosNumerosSerie) {
		super();
		this.videosBike = videosBike;
		this.videosNf = videosNf;
		this.videosNumerosSerie = videosNumerosSerie;
	}
	
	
	
	public String getVideosBike() {
		return videosBike;
	}
	public void setVideosBike(String videosBike) {
		this.videosBike = videosBike;
	}
	public String getVideosNf() {
		return videosNf;
	}
	public void setVideosNf(String videosNf) {
		this.videosNf = videosNf;
	}
	public String getVideosNumerosSerie() {
		return videosNumerosSerie;
	}
	public void setVideosNumerosSerie(String videosNumerosSerie) {
		this.videosNumerosSerie = videosNumerosSerie;
	}
	
	
	
	
}