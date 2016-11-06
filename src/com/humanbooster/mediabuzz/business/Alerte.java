package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Alerte {
	private Date dateAlerte;
	private Publication publication;
	
	public Alerte(Date dateAlerte, Publication publication) {
		super();
		this.dateAlerte = dateAlerte;
		this.publication = publication;
	}

	public Date getDateAlerte() {
		return dateAlerte;
	}

	public void setDateAlerte(Date dateAlerte) {
		this.dateAlerte = dateAlerte;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Alerte [dateAlerte=" + dateAlerte + ", publication="
				+ publication + "]";
	}
	
}
