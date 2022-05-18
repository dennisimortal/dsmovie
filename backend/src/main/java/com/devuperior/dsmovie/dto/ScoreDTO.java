package com.devuperior.dsmovie.dto;

public class ScoreDTO {

	private Long MovieID;
	private String email;
	private Double scpre;
	
	public ScoreDTO() {
	}

	public Long getMovieID() {
		return MovieID;
	}

	public void setMovieID(Long movieID) {
		MovieID = movieID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScpre() {
		return scpre;
	}

	public void setScpre(Double scpre) {
		this.scpre = scpre;
	}

	public Long getMovieId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
