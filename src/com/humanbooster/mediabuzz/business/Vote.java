package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Vote {

	// Attributes
	private Media media;
	// private int nbVote; superficiel car calculabme par une requete COUNT*
	private Date dateVote;
	// private Top top; L'utilisation d'une enumerationou d'un set (preferable
	// set) permet la supression des deux class top et flop
	// private Flop flop;
	private ENUM vote; // TODO à rajouter dans le constructeur, getteru et
						// setteur

	// Constructors
	public Vote(Media media, Date dateVote, ENUM vote) {
		super();
		this.media = media;
		this.dateVote = dateVote;
		this.vote = vote;
	}

	// Methods

	// gets&sets

	public ENUM getVote() {
		return vote;
	}

	public void setVote(ENUM vote) {
		this.vote = vote;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public Date getDateVote() {
		return dateVote;
	}

	public void setDateVote(Date dateVote) {
		this.dateVote = dateVote;
	}

	@Override
	public String toString() {
		return "Vote [media=" + media + ", dateVote=" + dateVote + ", vote="
				+ vote + "]";
	}

}
