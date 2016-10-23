package com.humanbooster.mediabuzz.business;

import java.util.Date;

public class Top{
	//Attributes
	private Vote vote;
	int nbVote;
	
	//Constructors
	public Top(Vote vote, int nbVote) {
		super();
		this.vote = vote;
		this.nbVote = nbVote;
	}

	//Methods
	
	//Gets&Sets
	public Vote getVote() {
		return vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public int getNbVote() {
		return nbVote;
	}

	public void setNbVote(int nbVote) {
		this.nbVote = nbVote;
	}
		
	
}
