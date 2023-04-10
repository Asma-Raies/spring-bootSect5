package com.asma.makeUp.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class MakeUp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long refMakeUp;
	private String nomMakeUp;
	private Double prixMakeUp;
	private Date dateCreation;
	private int  quantite ;
	public MakeUp() {
	super();
	}
	public MakeUp(String nomMakeUp, Double prixMakeUp, Date dateCreation,int qte ) {
	super();
	this.nomMakeUp = nomMakeUp;
	this.prixMakeUp = prixMakeUp;
	this.dateCreation = dateCreation;
	this.quantite = qte;
	}
	public Long getRefMakeUp() {
		return refMakeUp;
		}
	public void setRefMakeUp(Long refMakeUp) {
		this.refMakeUp = refMakeUp;
		}
		public String getNomMakeUp() {
		return nomMakeUp;
		}
		public void setNomMakeUp(String nomMakeUp) {
		this.nomMakeUp= nomMakeUp;
		}
		public Double getPrixMakeUp() {
		return prixMakeUp;
		}
		public void setPrixMakeUp(Double prixMakeUp) {
		this.prixMakeUp = prixMakeUp;
		}
		public Date getDateCreation() {
		return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		}
		public int getQuantite() {
			return quantite;
			}
			public void setQuantite(int quantite) {
			this.quantite = quantite;
			}
		@Override
		public String toString() {
		return "MakeUp [referenceMakeUp=" + refMakeUp + ", nomMakeUp=" + 
				nomMakeUp + ", prixMakeUp=" + prixMakeUp
		+ ", dateCreation=" + dateCreation +",quantite="+quantite+ "]";
		}
}


