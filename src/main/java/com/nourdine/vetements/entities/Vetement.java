package com.nourdine.vetements.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Vetement {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Long idVet;
	private String marqueVet;
	private Double prixVet;
	private Date DateAchat;
	public Long getIdVet() {
		return idVet;
	}
	public void setIdVet(Long idVet) {
		this.idVet = idVet;
	}
	public String getMarqueVet() {
		return marqueVet;
	}
	public void setMarqueVet(String marqueVet) {
		this.marqueVet = marqueVet;
	}
	public Double getPrixVet() {
		return prixVet;
	}
	public void setPrixVet(Double prixVet) {
		this.prixVet = prixVet;
	}
	public Date getDateAchat() {
		return DateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		DateAchat = dateAchat;
	}
	public Vetement() {
		super();
		 
	}
	public Vetement(String marqueVet, Double prixVet, Date dateAchat) {
		super();
		this.marqueVet = marqueVet;
		this.prixVet = prixVet;
		DateAchat = dateAchat;
	}
	@Override
	public String toString() {
		return "Vetement [idVet=" + idVet + ", marqueVet=" + marqueVet + ", prixVet=" + prixVet + ", DateAchat="
				+ DateAchat + "]";
	}
	
	
	
	
}
