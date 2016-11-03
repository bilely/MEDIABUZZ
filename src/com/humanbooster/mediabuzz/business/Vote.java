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
	public Vote(Media media, int nbVote, Date dateVote, Top top, Flop flop) {
		super();
		this.media = media;
		this.nbVote = nbVote;
		this.dateVote = dateVote;
		this.top = top;
		this.flop = flop;
	}

	// Methods

	// gets&sets

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public int getNbVote() {
		return nbVote;
	}

	public void setNbVote(int nbVote) {
		this.nbVote = nbVote;
	}

	public Date getDateVote() {
		return dateVote;
	}

	public void setDateVote(Date dateVote) {
		this.dateVote = dateVote;
	}

	public Top getTop() {
		return top;
	}

	public void setTop(Top top) {
		this.top = top;
	}

	public Flop getFlop() {
		return flop;
	}

	public void setFlop(Flop flop) {
		this.flop = flop;
	}

	// ToString
	@Override
	public String toString() {
		return "Vote [nbVote=" + nbVote + ", dateVote=" + dateVote + "]";
	}

}
